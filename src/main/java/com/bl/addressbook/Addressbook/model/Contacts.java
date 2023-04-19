package com.bl.addressbook.Addressbook.model;

import com.bl.addressbook.Addressbook.dto.ContactDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Contacts {
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private Long mobileNumber;

    public Contacts() {}

    public Contacts(ContactDTO contactDTO) {
        this.firstName = contactDTO.firstName;
        this.lastName = contactDTO.lastName;
        this.address = contactDTO.address;
        this.city =contactDTO.city;
        this.mobileNumber = contactDTO.mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }
}
