package com.bridgelabz.addressbookworkshop.controller;

import com.bridgelabz.addressbookworkshop.DTO.AddressBookDTO;
import com.bridgelabz.addressbookworkshop.DTO.ResponseDTO;
import com.bridgelabz.addressbookworkshop.module.AddressBookModule;
import com.bridgelabz.addressbookworkshop.service.IAddressBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @Autowired
    IAddressBook iAddressBook;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Rohit Welcome to addressBook app";
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseDTO> addPerson(@Valid @RequestBody AddressBookDTO addressBookDTO){
        AddressBookModule newAddressBook = new AddressBookModule(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Add record  Successfully",iAddressBook.addPerson(newAddressBook));
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressById(@PathVariable Integer id) {
        ResponseDTO responseDTO = new ResponseDTO("Record found successfully", iAddressBook.searchById(id));
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.CREATED);
    }

    @GetMapping("/get-all")
    public ResponseEntity<ResponseDTO> getAddress(){
        ResponseDTO responseDTO = new ResponseDTO("Getting all the record successfully", iAddressBook.searchAll());
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<ResponseDTO> editData(@PathVariable Integer id, @Valid @RequestBody AddressBookDTO addressBookDTO) {
        ResponseDTO responseDTO = new ResponseDTO("Record updated Successfully",iAddressBook.update(id,addressBookDTO));
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddress(@PathVariable Integer id){
        ResponseDTO responseDTO = new ResponseDTO("Record found and removed successfully", iAddressBook.removeById(id));
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
