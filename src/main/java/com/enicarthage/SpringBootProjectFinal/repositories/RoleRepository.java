package com.enicarthage.SpringBootProjectFinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enicarthage.SpringBootProjectFinal.entities.Role;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
//	Role findByRole(String role);
}
