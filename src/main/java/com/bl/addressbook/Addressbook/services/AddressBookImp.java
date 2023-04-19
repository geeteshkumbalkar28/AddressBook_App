package com.bl.addressbook.Addressbook.services;

import com.bl.addressbook.Addressbook.dto.ContactDTO;
import com.bl.addressbook.Addressbook.model.Contacts;

import java.util.LinkedList;

public class AddressBookImp implements IAddressBook{
    LinkedList<Contacts> contactList = new LinkedList<>();
    @Override
    public String addContact(ContactDTO contactDTO) {
        Contacts contacts = new Contacts(contactDTO);
        contactList.add(contacts);
        return "Data save succesfully";
    }

    @Override
    public String getContactByID(int id) {
        Contacts contacts = new Contacts();
        for(int counter=0; counter<contactList.size();counter++){

            if((contactList.get(counter).getId())== id){
                return contactList.get(counter).toString();
            }
        }
        return "id is invalid";
     }

    @Override
    public String getAllContact() {
        return contactList.toString();
    }

    @Override
    public String deleteContactByID(int id) {
        contactList.remove(id);
        return "Deleted id "+id;
    }

    @Override
    public String deleteAllContact() {

        contactList = null;
        return "All contact deleted";
    }

    @Override
    public String updateContactDetailsByID(int id) {

        return null;
    }
}
