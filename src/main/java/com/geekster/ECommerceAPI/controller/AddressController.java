package com.geekster.ECommerceAPI.controller;

import com.geekster.ECommerceAPI.model.Address;
import com.geekster.ECommerceAPI.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping(value = "/getAllAddress")
    public List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }

    @GetMapping(value = "/getAddressById/{addressId}")
    public Address getAddressById(@PathVariable int addressId) {
        return addressService.getAddressById(addressId);
    }

    @PostMapping(value = "/addAddress")
    public String addAddressData(@RequestBody List<Address> addresses){
        return addressService.addAddresses(addresses);
    }
}
