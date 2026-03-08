package com.ecom.service;

import java.util.List;

import com.ecom.entity.Address;

public interface AddressService {
	
	Address addAddress(Long userId,Address address);
	
	List<Address> getUserAddress(Long userId);
}
