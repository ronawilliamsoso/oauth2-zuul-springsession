package com.zoro.services.order;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class authorizeClient {

    
	

	
	@Test
    public void authorizeClient() {
        
		final String client = "orderclient";
        authorizeClient(client);
 
    }
	
	
	public void authorizeClient(String clientId) {
        final Map<String, String> params = new HashMap<String, String>();
        params.put("response_type", "code");
        params.put("client_id", clientId);
        params.put("scope", "read,write");
		final Response response = RestAssured.given().auth().preemptive().basic(clientId, "123456").and().with()
				.params(params).when().post("http://localhost:8769/uaa/oauth/authorize");

		System.out.println(response.getCookie("JSESSIONID"));
    }
 
}