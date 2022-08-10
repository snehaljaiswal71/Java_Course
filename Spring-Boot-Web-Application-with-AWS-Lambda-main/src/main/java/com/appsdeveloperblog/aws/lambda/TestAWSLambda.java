package com.appsdeveloperblog.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class TestAWSLambda implements RequestHandler<String, Object> {

	@Override
	public Object handleRequest(String arg0, Context arg1) {
		// TODO Auto-generated method stub
		return "AWS Lambda Functions";
	}

}
