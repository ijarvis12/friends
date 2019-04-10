package com.example.friends;

import java.util.ArrayList;

public class ContactsManager {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void createContact(String name, String phoneNumber) {
        this.contacts.add(new Contact(name, phoneNumber));
    }
}
