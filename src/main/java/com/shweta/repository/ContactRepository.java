package com.shweta.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shweta.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,Serializable>{

}
