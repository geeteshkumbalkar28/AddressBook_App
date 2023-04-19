package com.bl.addressbook.Addressbook.controller;

import com.bl.addressbook.Addressbook.dto.ContactDTO;
import com.bl.addressbook.Addressbook.model.Contacts;
//import com.bl.addressbook.Addressbook.repository.ContactsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/AddressBook")
public class AddressBookController {
    List<Contacts> contactsList = new ArrayList<>();

    @PostMapping("/save")
    public ResponseEntity<String> addContact(@RequestBody ContactDTO contactDTO){
        Contacts data = new Contacts(contactDTO);

        contactsList.add(data);
        return new ResponseEntity<>("Contact save Successfully "+contactDTO.firstName+" "+contactDTO.lastName+" "
                +contactDTO.address+" "+contactDTO.city+" "+contactDTO.mobileNumber, HttpStatus.CREATED);
    }

    @GetMapping("/Get/{id}")
    public Contacts getContactsById(@PathVariable int id){
        Contacts contacts = contactsList.get(id);

        return contacts;
    }
    @GetMapping("/GetAll")
    public String getAllContacts(){
        return contactsList.toString();
    }
    @PutMapping("Edit/{id}")
    public String editContactById(@PathVariable int id){
        return "id"+id;
    }
    @DeleteMapping("/Delete/{id}")
    public String deleteContactById(@PathVariable int id){
        return "Contact has been deleted";
    }
    @DeleteMapping("/DeleteAll")
    public String deleteAllContacts(){
        return "All contacts has been deleted" ;
    }


}
