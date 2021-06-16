package com.sus.api.scm.Login;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import io.restassured.specification.RequestSpecification;
import resources.Utils;
import static io.restassured.RestAssured.given;
public class Login {
	
	public static RequestSpecification generateRequestLoginID()
			throws IOException {
		return given().spec(Utils.requestSpecification()).log().all();
	}
	
	public static RequestSpecification generateRequestValidateUserLoginID(Map<String , String> headerMap, Object obj)
			throws IOException {
		return given().spec(Utils.requestSpecification(headerMap)).body(obj).log().all();
	}
	
	

}
