package com.sus.api.scm.utils;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;

import com.sus.api.scm.Login.Login;
import com.sus.api.scm.Login.LoginAPIPayLoad;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.APIResources;
import resources.Utils;

public class LoginUtils {
	public static RequestSpecification res;
	static Response response;

	public static HashMap<String, String> getUserLoginKeyToken() throws IOException {
		HashMap<String, String> userLoginResponseData = new HashMap<>();
		APIResources resourceAPI = APIResources.valueOf("GetLoginID");
		try {
			res = Login.generateRequestLoginID();
			response = Utils.getResponse(res, "post", resourceAPI.getResource());
			Assert.assertEquals(response.getStatusCode(), 200);
			userLoginResponseData.put("tokenId", Utils.getJsonPath(response, "result.Data.tokenId"));
			userLoginResponseData.put("key", Utils.getJsonPath(response, "result.Data.key"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userLoginResponseData;
	}

	public static HashMap<String, String> getUserIdSessionTokenValidateUserLogin(Map<String, String> headerMap,
			String userName, String passWord) throws IOException {
		HashMap<String, String> loginValidateResponseData = new HashMap<>();
		APIResources resourceAPI = APIResources.valueOf("ValidateUserLogin");
		try {
			ResultSet resultSet = DataBaseUtil.getResultSet(SqlQuery.getDefaultAccount(userName));
			resultSet.next();
			String defaultAccount = resultSet.getString("UtilityAccountNumber");
			String validateUserLogin = LoginAPIPayLoad.getValidateUserLogin(userName, passWord, defaultAccount);
			res = Login.generateRequestValidateUserLoginID(headerMap, validateUserLogin);
			response = Utils.getResponse(res, "post", resourceAPI.getResource());
			Assert.assertEquals(response.getStatusCode(), 200);
			loginValidateResponseData.put("UserID", Utils.getJsonPath(response, "result.Data.Table[0].UserID"));
			loginValidateResponseData.put("SessionToken",
					Utils.getJsonPath(response, "result.Data.Table[0].SessionToken"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginValidateResponseData;

	}
}
