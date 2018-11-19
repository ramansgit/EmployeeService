package com.bgv.api;

import java.util.Collections;
import java.util.Map;

import org.apache.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.bgv.model.ApiGatewayResponse;
import com.bgv.model.ApiResponse;
import com.bgv.model.Employee;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.serverless.db.EmployeeDao;


public class CreateProfileHandler implements RequestHandler<Map<String, Object>, ApiGatewayResponse> {

	private final Logger logger = Logger.getLogger(this.getClass());

	@Override
	public ApiGatewayResponse handleRequest(Map<String, Object> input, Context context) {

		try {
			// get the 'body' from input
			JsonNode body = new ObjectMapper().readTree((String) input.get("body"));
			logger.info(body);

			Employee newJsonNode = new ObjectMapper().treeToValue(body, Employee.class);
			EmployeeDao employeeDao = new EmployeeDao();
			employeeDao.save(newJsonNode);

			// send the response back
			return ApiGatewayResponse.builder().setStatusCode(200).setObjectBody(newJsonNode)
					.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & Serverless")).build();

		} catch (Exception ex) {
			logger.error("Error in saving Profile: " + ex);

			// send the error response back
			ApiResponse responseBody = new ApiResponse("Error in saving Profile: ", input);
			return ApiGatewayResponse.builder().setStatusCode(500).setObjectBody(responseBody)
					.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & Serverless")).build();
		}
	}
}