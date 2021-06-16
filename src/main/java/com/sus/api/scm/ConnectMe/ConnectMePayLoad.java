package com.sus.api.scm.ConnectMe;

import com.sus.api.scm.Filepaths;

import resources.Utils;

public class ConnectMePayLoad {
	static String sSetConnectMeProgram = Filepaths.sConnectMeProgramJson + "ProgramPayload.json";

	/**
	 * This Method is used to Create Connect Me program payload
	 * 
	 * @author Souradeep.Ghosh
	 * @return
	 */
	public static String createConnectMeProgramPayload() {
		String body = null;
		try {
			body = Utils.generateStringFromResource(sSetConnectMeProgram);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return body;
	}
	
//	public static String createConnectMeOutagePayload() {
//		String body = null;
//		try {
//			body = Utils.generateStringFromResource(sSetConnectMeOutage);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return body;
//	}
}
