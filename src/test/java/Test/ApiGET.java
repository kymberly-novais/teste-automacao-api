package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiGET {

	@Test
	public void statuscode() {
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		int statusCode = response.getStatusCode();
		String retorno = response.asPrettyString();
		
		assertEquals(200, statusCode);
				
		System.out.println("Retorno do status code = " + statusCode);
		
		System.out.println("Response = \n" + retorno);
		
	}
}
