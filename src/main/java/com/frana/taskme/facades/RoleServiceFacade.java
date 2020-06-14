package com.frana.taskme.facades;

import java.util.List;

import org.springframework.stereotype.Component;

import com.frana.taskme.entities.Role;
import com.frana.taskme.services.RoleService;

@Component
public class RoleServiceFacade {

	private final RoleService roleService;

	public RoleServiceFacade(RoleService roleService) {
		this.roleService = roleService;
	}
	
	public List<Role> findAllRoles() {
		return roleService.findAll();
	}
}
