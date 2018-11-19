package com.bgv.api;

import java.util.Collections;
import java.util.Map;

import org.apache.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.bgv.model.ApiGatewayResponse;
import com.bgv.model.ApiResponse;
import com.serverless.db.EmployeeDao;

public class GetProfileHandler implements RequestHandler<Map<String, Object>, ApiGatewayResponse> {

	private final Logger logger = Logger.getLogger(this.getClass());

	@Override
	public ApiGatewayResponse handleRequest(Map<String, Object> input, Context context) {

		try {
			// get the 'pathParameters' from input
			Map<String, String> pathParameters = (Map<String, String>) input.get("pathParameters");
			String productId = pathParameters.get("id");

			// get the Product by id
			EmployeeDao profile = new EmployeeDao().get(productId);

			// send the response back
			if (profile != null) {
				return ApiGatewayResponse.builder().setStatusCode(200).setObjectBody(profile)
						.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & Serverless")).build();
			} else {
				return ApiGatewayResponse.builder().setStatusCode(404)
						.setObjectBody("Product with id: '" + productId + "' not found.")
						.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & Serverless")).build();
			}
		} catch (Exception ex) {
			logger.error("Error in retrieving product: " + ex);

			// send the error response back
			ApiResponse responseBody = new ApiResponse("Error in retrieving product: ", input);
			return ApiGatewayResponse.builder().setStatusCode(500).setObjectBody(responseBody)
					.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & Serverless")).build();
		}
	}
}