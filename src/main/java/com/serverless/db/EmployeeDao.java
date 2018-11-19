package com.serverless.db;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedQueryList;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.bgv.model.Employee;

public class EmployeeDao {

    // get the table name from env. var. set in serverless.yml
    private static final String TABLE_NAME = "profiles";

    private static DynamoDBAdapter db_adapter;
    private final AmazonDynamoDB client;
    private final DynamoDBMapper mapper;

    private Logger logger = Logger.getLogger(this.getClass());

  
    public EmployeeDao() {
        // build the mapper config
        DynamoDBMapperConfig mapperConfig = DynamoDBMapperConfig.builder()
            .withTableNameOverride(new DynamoDBMapperConfig.TableNameOverride(TABLE_NAME))
            .build();
        // get the db adapter
        this.db_adapter = DynamoDBAdapter.getInstance();
        this.client = this.db_adapter.getDbClient();
        // create the mapper with config
        this.mapper = this.db_adapter.createDbMapper(mapperConfig);
    }

    // methods
    public Boolean ifTableExists() {
        return this.client.describeTable(TABLE_NAME).getTable().getTableStatus().equals("ACTIVE");
    }

    public List<EmployeeDao> list() throws IOException {
      DynamoDBScanExpression scanExp = new DynamoDBScanExpression();
      List<EmployeeDao> results = this.mapper.scan(EmployeeDao.class, scanExp);
      for (EmployeeDao p : results) {
        logger.info("Profiles - list(): " + p.toString());
      }
      return results;
    }

    public EmployeeDao get(String id) throws IOException {
        EmployeeDao Profile = null;

        HashMap<String, AttributeValue> av = new HashMap<String, AttributeValue>();
        av.put(":v1", new AttributeValue().withS(id));

        DynamoDBQueryExpression<EmployeeDao> queryExp = new DynamoDBQueryExpression<EmployeeDao>()
            .withKeyConditionExpression("id = :v1")
            .withExpressionAttributeValues(av);

        PaginatedQueryList<EmployeeDao> result = this.mapper.query(EmployeeDao.class, queryExp);
        if (result.size() > 0) {
          Profile = result.get(0);
          logger.info("Profiles - get(): Profile - " + Profile.toString());
        } else {
          logger.info("Profiles - get(): Profile - Not Found.");
        }
        return Profile;
    }

    public void save(Employee Profile) throws IOException {
        logger.info("Profiles - save(): " + Profile.toString());
        this.mapper.save(Profile);
    }

    public Boolean delete(String id) throws IOException {
        EmployeeDao Profile = null;

        // get Profile if exists
        Profile = get(id);
        if (Profile != null) {
          logger.info("Profiles - delete(): " + Profile.toString());
          this.mapper.delete(Profile);
        } else {
          logger.info("Profiles - delete(): Profile - does not exist.");
          return false;
        }
        return true;
    }

}