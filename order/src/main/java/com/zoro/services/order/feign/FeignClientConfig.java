package com.zoro.services.order.feign;

import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;

@Configuration
public class FeignClientConfig {


	@Bean
	public OAuth2FeignRequestInterceptor requestInterceptor() {
		OAuth2ClientContext clientContext = new DefaultOAuth2ClientContext();
		ResourceOwnerPasswordResourceDetails resource = new ResourceOwnerPasswordResourceDetails();
		resource.setAccessTokenUri("http://localhost:8769/uaa/oauth/token");
		resource.setClientId("orderclient");
		resource.setId("openid");
		// resource.setScope(Arrays.asList("privateid"));
		resource.setUsername("sam");
		resource.setPassword("123");
		resource.setClientSecret("123456");
		// resource.setGrantType("password");
		return new OAuth2FeignRequestInterceptor(clientContext, resource);
	}


}

