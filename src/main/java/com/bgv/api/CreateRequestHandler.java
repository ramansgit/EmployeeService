package com.bgv.api;
import java.util.Collections;
import org.apache.log4j.Logger;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.bgv.model.ApiGatewayResponse;
import com.bgv.model.Employee;
import com.bgv.model.Response;

public class CreateRequestHandler implements RequestHandler<Employee, ApiGatewayResponse> {

	private final Logger logger = Logger.getLogger(this.getClass());

	@Override
	public ApiGatewayResponse handleRequest(Employee request, Context context) {

		try {
			// send the response back
			return ApiGatewayResponse.builder()
					.setStatusCode(200)
					.setObjectBody(request)
					.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & Serverless"))
					.build();

		} catch (Exception ex) {
			logger.error("Error in saving employee data: " + ex);

			// send the error response back
			Response responseBody = new Response("Error in saving employee data: ", request);
			return ApiGatewayResponse.builder()
					.setStatusCode(500)
					.setObjectBody(responseBody)
					.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & Serverless"))
					.build();
		}
	}
}

