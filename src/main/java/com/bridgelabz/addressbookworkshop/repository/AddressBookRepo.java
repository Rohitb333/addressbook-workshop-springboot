package com.bridgelabz.addressbookworkshop.repository;

import com.bridgelabz.addressbookworkshop.module.AddressBookModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepo extends JpaRepository<AddressBookModule, Integer> {
}
