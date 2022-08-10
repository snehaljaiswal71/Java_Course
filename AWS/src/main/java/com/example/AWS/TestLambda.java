package com.example.AWS;

import com.amazonaws.services.lambda.runtime.Context;

public class TestLambda {
	public String handleRequest(String input, Context context) {
		context.getLogger().log("Input: " + input);
		return "Hello World - " + input;
	}
}
