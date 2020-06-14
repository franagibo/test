package com.frana.taskme.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.frana.taskme.entities.Role;
import com.frana.taskme.repositories.RoleRepository;

@Service
public class RoleService {
	
	private final RoleRepository roleRepository;

	public RoleService(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}
	
	public List<Role> findAll() {
		return roleRepository.findAll();
	}
}
