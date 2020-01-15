package com.commerceFlow.automate;

import org.apache.commons.lang3.RandomStringUtils;

import com.hylamobile.utils.misc.FileUtils;
import com.commerceFlow.*;
import com.jayway.jsonpath.DocumentContext;

import commerceFlow.JsonUtils;
import io.restassured.RestAssured;

public class ExecuteCommerFlow implements CommerceFlowUtils {

	public static void commerceFlow() {
		
		RequestSpecification request = RestAssured.given();

		request.header("Content-Type", "application/json");
		request.header("Accept","application/json");
		
		request.auth().basic("cbd_user", "Password1");
		
	String jsonString = FileUtils.getFileContent(COMMERCE_FLOW_FILE_PATH);

	DocumentContext jsonContext = JsonUtils.getJsonContext(jsonString);

	jsonString = jsonContext.jsonString();
	request.body(jsonString);
	
	return response;
	}
}
