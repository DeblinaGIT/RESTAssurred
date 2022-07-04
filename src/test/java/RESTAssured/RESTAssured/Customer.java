package RESTAssured.RESTAssured;


	import static org.testng.Assert.assertEquals;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

		public class Customer extends DataForTest{

			@Test(dataProvider = "DataForPost")
		    public void getProduct(String name, String job) throws FileNotFoundException {
	            //String filename="/RESTAssured/src/test/java/Resources/CreateUser.json";
		        baseURI = "https://reqres.in";

		        JSONObject request = new JSONObject();

				request.put("name",name);
				request.put("job",job);
				
		        //FileInputStream fis = new FileInputStream(new File(filename));

		        //Response response = null;

		        try {
		        	given().
		    		contentType(ContentType.JSON).
		    		accept(ContentType.JSON).
		    		header("Content-Type", "application/json").
		    		body(request.toJSONString()).
		    		when().
		    		post("/api/users").
		    		then().
		    		statusCode(201).
		    		log().all();
		                
		        } catch (Exception e) {
		            e.printStackTrace();
		        }

		        //System.out.println("Response :" + response.asString());
		        //System.out.println("Status Code :" + response.getStatusCode());
		        

		        //assertEquals(200, response.getStatusCode());
		    }
		}

