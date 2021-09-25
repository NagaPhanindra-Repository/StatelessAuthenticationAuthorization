package com.codemer.authserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemer.authserver.model.Role;
import com.codemer.authserver.model.cardHolder;

@Repository
public interface rolesRepository extends JpaRepository<Role, Integer>{

}
