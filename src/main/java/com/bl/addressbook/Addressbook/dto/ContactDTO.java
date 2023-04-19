package com.bl.addressbook.Addressbook.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;



public class ContactDTO {

  @NotNull(message = "FirstName Cannot be empty")
  @Pattern(regexp = "^[A-Z][A-Za-z]$",message = "first Name is invalid(Ex:Geetesh)")
   public String firstName;

    @NotNull(message = "Last Name Cannot be empty")
    @Pattern(regexp = "^[A-Z][A-Za-z]$",message = "Last Name is invalid(Ex:Kumbalkar)")
    public String lastName;

    @NotNull(message = "Address Cannot be empty")
    @Pattern(regexp = "^[A-Z][A-Za-z]$",message = "Address is invalid(Ex:Sudampuri)")
    public String address;

    @NotNull(message = "City Cannot be empty")
    @Pattern(regexp = "^[A-Z][A-Za-z]$",message = "city is invalid(Ex:Wardha)")
    public String city;

    @NotNull(message = "mobile Cannot be empty")
    @Pattern(regexp = "^[6-9][0-9]{9}$" ,message = "Mobile is invalid(Ex:9855446624)")
    public Long mobileNumber;
}
