package com.sus.api.scm.pojo;

public class LoginPayload {
	private String UpdatedDate;
	private String Deviceid;
	private String LanguageCode;
	private String password;
	private String UserId;
	private String UtilityAccountNumber;
	private String LoginMode;
	private String IsCSRUser;
	private String ExternalLoginId;
	private String PushToken;
	private String LUpdHideShow;
	private String TimeOffSet;
	private String IPAddress;

	public LoginPayload(String UpdatedDate, String Deviceid, String LanguageCode, String password, String UserId,
			String UtilityAccountNumber, String LoginMode, String IsCSRUser, String ExternalLoginId, String PushToken,
			String LUpdHideShow, String TimeOffSet, String IPAddress) {
		this.UpdatedDate = UpdatedDate;
		this.Deviceid = Deviceid;
		this.LanguageCode = LanguageCode;
		this.password = password;
		this.UserId=UserId;
		this.UtilityAccountNumber=UtilityAccountNumber;
		this.LoginMode=LoginMode;
		this.IsCSRUser=IsCSRUser;
		this.ExternalLoginId=ExternalLoginId;
		this.PushToken=PushToken;
		this.LUpdHideShow=LUpdHideShow;
		this.TimeOffSet=TimeOffSet;
		this.IPAddress=IPAddress;

	}

	public String getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		UpdatedDate = updatedDate;
	}

	public String getDeviceid() {
		return Deviceid;
	}

	public void setDeviceid(String deviceid) {
		Deviceid = deviceid;
	}

	public String getLanguageCode() {
		return LanguageCode;
	}

	public void setLanguageCode(String languageCode) {
		LanguageCode = languageCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getUtilityAccountNumber() {
		return UtilityAccountNumber;
	}

	public void setUtilityAccountNumber(String utilityAccountNumber) {
		UtilityAccountNumber = utilityAccountNumber;
	}

	public String getLoginMode() {
		return LoginMode;
	}

	public void setLoginMode(String loginMode) {
		LoginMode = loginMode;
	}

	public String getIsCSRUser() {
		return IsCSRUser;
	}

	public void setIsCSRUser(String isCSRUser) {
		IsCSRUser = isCSRUser;
	}

	public String getExternalLoginId() {
		return ExternalLoginId;
	}

	public void setExternalLoginId(String externalLoginId) {
		ExternalLoginId = externalLoginId;
	}

	public String getPushToken() {
		return PushToken;
	}

	public void setPushToken(String pushToken) {
		PushToken = pushToken;
	}

	public String getLUpdHideShow() {
		return LUpdHideShow;
	}

	public void setLUpdHideShow(String lUpdHideShow) {
		LUpdHideShow = lUpdHideShow;
	}

	public String getTimeOffSet() {
		return TimeOffSet;
	}

	public void setTimeOffSet(String timeOffSet) {
		TimeOffSet = timeOffSet;
	}

	public String getIPAddress() {
		return IPAddress;
	}

	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}
}
