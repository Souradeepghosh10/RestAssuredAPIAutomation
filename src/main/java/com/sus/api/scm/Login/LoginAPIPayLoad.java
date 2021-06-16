package com.sus.api.scm.Login;

public class LoginAPIPayLoad {
	
	public static String getValidateUserLogin(String userName, String passWord, String UtilityNum) {
		String body = "{\r\n  \"UserId\": \"" + userName + "\",\r\n  \"password\": \"" + passWord
				+ "\",\r\n  \"IPAddress\": \"127.0.0.1\",\r\n  \"LanguageCode\": \"EN\",\r\n  \"ExternalLoginId\": \"\",\r\n  \"LoginMode\": 1,\r\n  \"IsCSRUser\": 0,\r\n  \"PushToken\": null,\r\n  \"Deviceid\": null,\r\n  \"UtilityAccountNumber\": \""
				+ UtilityNum
				+ "\",\r\n  \"UpdatedDate\": \"01-01-0001 12:00:00 AM\",\r\n  \"LUpdHideShow\": null,\r\n  \"TimeOffSet\": 0,\r\n  \"deviceType\": \"Web\",\r\n  \"OperatingSystem\": \"WinNT\",\r\n  \"Browser\": \"Firefox\",\r\n  \"Country\": \"US\"\r\n}";
		return body;
	}
}
