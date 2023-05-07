package com.geekster.ECommerceAPI.service;

import com.geekster.ECommerceAPI.model.Address;
import com.geekster.ECommerceAPI.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService {

    @Autowired
    IAddressRepository addressRepository;

    public List<Address> getAllAddress() {
        return (List<Address>) addressRepository.findAll();
    }

    public Address getAddressById(int addressId) {
        return addressRepository.findById(addressId).get();
    }

    public String addAddresses(List<Address> addresses) {
        addressRepository.saveAll(addresses);
        return "Addresses added successfully";
    }
}
