package com.ecom.service.impl;

import java.util.List;

import com.ecom.entity.Address;
import com.ecom.repository.AddressRepository;
import com.ecom.service.AddressService;

public class AddressServiceImpl implements AddressService{
	
	private AddressRepository addressRepository;

	@Override
	public Address addAddress(Long userId, Address address) {
		// TODO Auto-generated method stub
		address.setUserId(userId);
		return addressRepository.save(address);
	}

	@Override
	public List<Address> getUserAddress(Long userId) {
		// TODO Auto-generated method stub
		return addressRepository.findByUserId(userId);
	}

}
