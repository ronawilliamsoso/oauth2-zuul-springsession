package com.zoro.account.controller;

import java.security.Principal;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	@RequestMapping(value = "/useraccount", method = RequestMethod.GET)
	@ResponseBody
	public String useraccount(Principal principal) {
		return principal == null ? "Hello anonymous"
				: "Hello " + principal.getName() + " your account number is account001";
	}

	@RequestMapping(value = "/userpayment", method = RequestMethod.GET)
	@ResponseBody
	public String userpayment(Principal principal) {
		return principal == null ? "Hello anonymous"
				: "Hello " + principal.getName() + " your payment account is payment001";
	}

	@PreAuthorize("#oauth2.hasScope('openid') and hasRole('ROLE_ADMIN')")
	@RequestMapping(value = "/publicResource", method = RequestMethod.GET)
	@ResponseBody
	public String publicResource(Principal principal) {
		return principal == null ? "Hello anonymous" : " Hello " + principal.getName() + " you have public resource";
	}

	@PreAuthorize("#oauth2.hasScope('privateid') and hasRole('ROLE_ADMIN')")
	@RequestMapping(value = "/privateResource", method = RequestMethod.GET)
	@ResponseBody
	public String privateResource(Principal principal) {
		return principal == null ? "Hello anonymous" : " Hello " + principal.getName() + "you have private resource";
	}
}
