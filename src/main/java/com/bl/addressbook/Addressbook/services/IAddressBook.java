package com.bl.addressbook.Addressbook.services;

import com.bl.addressbook.Addressbook.dto.ContactDTO;

public interface IAddressBook {
    public String addContact(ContactDTO contactDTO);
    public String getContactByID(int id);
    public String getAllContact();
    public String deleteContactByID(int id);
    public String deleteAllContact();
    public String updateContactDetailsByID(int id);

}
