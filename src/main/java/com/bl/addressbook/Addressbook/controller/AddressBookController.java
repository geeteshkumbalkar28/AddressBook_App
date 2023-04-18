package com.bl.addressbook.Addressbook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/AddressBook")
public class AddressBookController {
    @PostMapping("/save")
    public ResponseEntity<String> addContact(@RequestParam String firstName,@RequestParam String lastName){
        return new ResponseEntity<>("Contact save Successfully "+firstName+" "+lastName, HttpStatus.CREATED);
    }
    @GetMapping("/Get/{id}")
    public String getContactsById(@PathVariable int id){
        return "id "+id;
    }
    @GetMapping("/GetAll")
    public String getAllContacts(){
        return "All Contacts";
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
