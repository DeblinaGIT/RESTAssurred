package RESTAssured.RESTAssured;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AccessToken {

	public static void generateToken()
	{
		RestAssured.baseURI="http://10.7.138.181:8080/vs2r-ch-ws/rest/OAuthServer";
		Response resp=null;
		JSONObject request = new JSONObject();

		request.put("username","Deblina345");
		request.put("password", "Deblina123!");
		request.put("sourceId","test");
		
		resp= RestAssured.given().header("authorization","Bearer eyJ0eXAiOiJKV1QiLCJ1c2UiOiJNU1QiLCJhcHAiOiJWUzJSIiwiYWxnIjoiUlMyNTYifQ.eyJpc3MiOiJGSVMiLCJhdWQiOiJUVGVzdCIsImV4cCI6MTY3MjQ2NjQwMCwiaWF0IjoxNjQ0MzkwMDQyLCJqdGkiOiI4M2E2OGJhNy03YWI5LTQxY2UtOWJhZS1jMzczOTU2ZTlkNmIifQ.7NSOX4JWhtuc0fa_U0oBD83R03qclVlwYSELVtHeiFFcSWJtoXhvojevA9c3lNsh8sFIz5CRu6ejYZ3VXrl04yOvvu7Pqw-KmFHe4P8zL98KuAG-ZM6NCKpNDoYmSq-lrIpRyjC4SO7l6gSp2y_AhQN_doZa7j60Hk3upxhYV-CZP4lLKI5d7zzxxAve8W-_1oL6PQlGXkF7UdPg6tJHHaPigddhcR8D9lgHITHQsJZd3cNIwzuiA8OxFXS7ZEt7BnSUgtfuGB5kN6eh9LexIYbm3fX0W6FdtpfgbcoRc6UUXI89LySgnmF1CCCHCvyKgxusVDUnwmUB415ZX2sa2g")
		
		/*.formParam("username","Deblina345")
		.formParam("password", "Deblina123!")
		.formParam("sourceId","test")*/
				.contentType(ContentType.JSON).
	    		accept(ContentType.JSON).
	    		header("Content-Type", "application/json").
	    		body(request.toJSONString())
	    		
	    			
				
		.post("/authenticateWithUnamePwd");
		
		//System.out.println(resp.getBody().asString());
		String token=resp.jsonPath().get("authCode");
		System.out.println(token);
	}
	
	public static void main(String []args)
	{
		generateToken();
	}
}
