package com.vaadin.tutorial.crm.backend.service;

import com.vaadin.tutorial.crm.backend.entity.Contact;
import com.vaadin.tutorial.crm.backend.repository.CompanyRepository;
import com.vaadin.tutorial.crm.backend.repository.ContactRepository;

import java.util.List;
import java.util.logging.Logger;

public class ContactService {
    private static final Logger LOGGER = Logger.getLogger(ContactService.class.getName());
    private ContactRepository contactRepository;
    private CompanyRepository companyRepository;

    public ContactService(ContactRepository contactRepository, CompanyRepository companyRepository) {
        this.contactRepository = contactRepository;
        this.companyRepository = companyRepository;
    }

    public List<Contact> findAll() {
        return contactRepository.findAll();
    }
}
