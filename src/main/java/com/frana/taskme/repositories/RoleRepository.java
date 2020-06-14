package com.frana.taskme.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frana.taskme.entities.Role;
import com.frana.taskme.enums.RolesEnum;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(RolesEnum role);
	
	List<Role> findAll();

}