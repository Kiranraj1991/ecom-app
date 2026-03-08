package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.entity.UserRole;
import com.ecom.entity.UserRoleId;

public interface UserRoleRepository extends JpaRepository<UserRole,UserRoleId>{

}
