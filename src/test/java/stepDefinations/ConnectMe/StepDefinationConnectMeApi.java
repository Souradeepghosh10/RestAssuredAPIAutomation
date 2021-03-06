package stepDefinations.ConnectMe;

import static io.restassured.RestAssured.given;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import com.sus.api.scm.ConnectMe.ConnectMePayLoad;
import com.sus.api.scm.utils.Context;
import com.sus.api.scm.utils.LoginUtils;
import com.sus.api.scm.utils.TestContext;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import junit.framework.Assert;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefinationConnectMeApi extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data = new TestDataBuild();
	TestContext testContext;

	public StepDefinationConnectMeApi(TestContext context) {
		testContext = context;
	}

	@When("^User enters details for Connect me \"([^\"]*)\" and \"([^\"]*)\" the request for API$")
	public void user_enters_details_for_Connect_me_and_the_request_for_API(String resource, String methodType)
			throws Throwable {
		String loginToken = (String) testContext.scenarioContext.getContext(Context.Final_Login_Token);
		Map<String, String> headerMap = new HashMap<>();
		headerMap.put("Authorization", loginToken);
		headerMap.put("SourceType", "1");
		res = given().spec(requestSpecification(headerMap)).body(ConnectMePayLoad.createConnectMeProgramPayload()).log()
				.all();
		APIResources resourceAPI = APIResources.valueOf(resource);
		System.out.println(resourceAPI.getResource());
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		if (methodType.equalsIgnoreCase("POST"))
			response = res.when().post(resourceAPI.getResource());
		else if (methodType.equalsIgnoreCase("GET"))
			response = res.when().get(resourceAPI.getResource());
	}

	@When("^user validate API call got success  with status  code \"([^\"]*)\"$")
	public void user_validate_API_call_got_success_with_status_code(String statusCode) throws Throwable {
		assertEquals(Integer.toString(response.getStatusCode()), statusCode);
	}

}
