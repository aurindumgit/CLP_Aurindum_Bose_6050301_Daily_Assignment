package com.cg.securityApp.contoller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredController {
	@GetMapping("/publicEndPoint")
	public String forPublic() {
		return "this is public";
	}
	
	@GetMapping("/securedUserEndPoint")
	@PreAuthorize("hasAnyRole('USER','ADMIN')")
	public String forUser() {
		return "this is user only";
	}
	@GetMapping("/securedAdminEndPoint")
	@PreAuthorize("hasRole('ADMIN')")
	public String forAdmin() {
		return "this is admin";
	}
	

}
