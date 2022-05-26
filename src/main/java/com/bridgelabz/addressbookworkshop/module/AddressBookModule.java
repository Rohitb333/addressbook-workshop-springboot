package com.bridgelabz.addressbookworkshop.module;

import com.bridgelabz.addressbookworkshop.DTO.AddressBookDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBookModule {
    @Id
    @GeneratedValue
    public int id;
    public String fullName;
    public String phoneNumber;
    public String address;
    public String city;
    public String state;
    public int zip;

    public AddressBookModule(AddressBookModule addressBookModule) {
        this.id= id;
        this.fullName = addressBookModule.fullName;
        this.phoneNumber = addressBookModule.phoneNumber;
        this.address = addressBookModule.address;
        this.city=addressBookModule.city;
        this.state = addressBookModule.state;
        this.zip=addressBookModule.zip;
    }

    public AddressBookModule(AddressBookDTO addressBookDTO) {
        this.id= id;
        this.fullName = addressBookDTO.fullName;
        this.phoneNumber = addressBookDTO.phoneNumber;
        this.address = addressBookDTO.address;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.zip = addressBookDTO.zip;
    }

    public AddressBookModule(Integer id, AddressBookDTO addressBookDTO) {
        this.id= id;
        this.fullName = addressBookDTO.fullName;
        this.phoneNumber = addressBookDTO.phoneNumber;
        this.address = addressBookDTO.address;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.zip = addressBookDTO.zip;
    }

    public AddressBookModule(Integer id) {
        this.id=id;
    }
}
