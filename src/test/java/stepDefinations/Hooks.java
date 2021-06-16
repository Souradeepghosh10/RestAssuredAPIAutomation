package stepDefinations;

import java.sql.ResultSet;
import com.sus.api.scm.Filepaths;
import com.sus.api.scm.utils.JsonUtil;
import cucumber.api.java.Before;
import stepDefinations.Billing.StepDefinationCreateCardProfile;

public class Hooks {
	static JsonUtil jsUtil_paymentProfile_CC = new JsonUtil(Filepaths.sOneTimePaymentCCJsonFP, "createProfileCC.json");
	ResultSet rs;

	@Before("@DeleteCreditCard")
	public static void beforeScenario_DeleteCard() throws Exception {
		StepDefinationCreateCardProfile ccp = new StepDefinationCreateCardProfile();
		ccp.deleteCardProfile(jsUtil_paymentProfile_CC.getStringJsonValue("UserID"));
	}

}
