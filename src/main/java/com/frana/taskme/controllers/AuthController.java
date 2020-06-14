package com.frana.taskme.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frana.taskme.entities.Role;
import com.frana.taskme.facades.RoleServiceFacade;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {


	private final RoleServiceFacade roleServiceFacade;

	public AuthController(RoleServiceFacade roleServiceFacade) {
		this.roleServiceFacade = roleServiceFacade;
	}

	@GetMapping("/role")
	public List<Role> getRole() {
		List<Role> userRoles = roleServiceFacade.findAllRoles();
		return userRoles;
	}

}