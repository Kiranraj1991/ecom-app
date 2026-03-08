package com.ecom.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{
	
	List<Address> findByUserId(Long userId);
	

}
