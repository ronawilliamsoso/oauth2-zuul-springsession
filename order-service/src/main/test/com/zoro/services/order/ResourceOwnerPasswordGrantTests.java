package com.zoro.services.order;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;

public class ResourceOwnerPasswordGrantTests {



	@Test
	public void testConnectDirectlyToResourceServer() throws Exception {

		ResourceOwnerPasswordResourceDetails resource = new ResourceOwnerPasswordResourceDetails();

		resource.setAccessTokenUri("http://localhost:8769/uaa/oauth/token");
		resource.setClientId("orderclient");
		resource.setId("openid");
		resource.setScope(Arrays.asList("privateid"));
		resource.setUsername("sam");
		resource.setPassword("123");

		OAuth2RestTemplate template = new OAuth2RestTemplate(resource);
		String result = template.getForObject("http://localhost:8769/uaa/oauth/token", String.class);
		// System.err.println(result);
		assertEquals("Hello, Trusted User marissa", result);

	}

}