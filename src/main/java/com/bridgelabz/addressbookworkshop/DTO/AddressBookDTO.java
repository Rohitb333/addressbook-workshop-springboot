package com.bridgelabz.addressbookworkshop.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zAZ\\s]{2,}$", message = "Employee name Invalid")
    public String fullName;
    @javax.validation.constraints.NotNull(message = "Phone number can not be Null")
    public String phoneNumber;
    @NotEmpty(message="address cant be empty")
    public String address;
    @NotEmpty(message="city cant be empty")
    public String city;
    @NotEmpty(message="State cant be empty")
    public String state;
    @NotEmpty(message = "Zip code can not be Empty")
    public int zip;
}
