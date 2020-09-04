package com.example.demo.data.repository;

import com.example.demo.data.entity.Contacts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepo extends CrudRepository<Contacts, Long> {
}
