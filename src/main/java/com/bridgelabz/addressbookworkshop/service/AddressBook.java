package com.bridgelabz.addressbookworkshop.service;

import com.bridgelabz.addressbookworkshop.DTO.AddressBookDTO;
import com.bridgelabz.addressbookworkshop.module.AddressBookModule;
import com.bridgelabz.addressbookworkshop.repository.AddressBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressBook implements IAddressBook {
    @Autowired
    AddressBookRepo addressBookRepo;
    //---------------------------------Create-----------------------------------
    @Override
    public Object addPerson(AddressBookModule newAddressBook) {
        AddressBookModule addressBookModule = new AddressBookModule(newAddressBook);
        addressBookRepo.save(addressBookModule);
        return addressBookModule;
    }
    //-------------------------------------Search-----------------------------------
    @Override
    public Object searchById(Integer id) {
        if (addressBookRepo.findById(id).isPresent()){
            return addressBookRepo.findById(id);
        }
        return null;
    }
    //-------------------------------------Search-all-------------------------------
    @Override
    public Object searchAll() {
        return addressBookRepo.findAll();
    }
    //-------------------------------------Update-----------------------------------
    @Override
    public Object update(Integer id, AddressBookDTO addressBookDTO) {
        if (addressBookRepo.findById(id).isPresent()) {
            AddressBookModule newAddressBook = new AddressBookModule(id, addressBookDTO);
            AddressBookModule search = addressBookRepo.save(newAddressBook);
            return "Done " + search;
        }
        return null;
    }
    //-------------------------------------Delete-----------------------------------
    @Override
    public Object removeById(Integer id) {
        Optional<AddressBookModule> newEmployee = addressBookRepo.findById(id);
        if (newEmployee.isPresent()){
            addressBookRepo.delete(newEmployee.get());
            return "Record is deleted with id ";
        }
        return null;
    }
}
