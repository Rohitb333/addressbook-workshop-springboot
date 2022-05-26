package com.bridgelabz.addressbookworkshop.service;

import com.bridgelabz.addressbookworkshop.DTO.AddressBookDTO;
import com.bridgelabz.addressbookworkshop.module.AddressBookModule;

public interface IAddressBook  {
    Object addPerson(AddressBookModule newAddressBook);

    Object searchById(Integer id);

    Object searchAll();

    Object update(Integer id, AddressBookDTO addressBookDTO);

    Object removeById(Integer id);
}
