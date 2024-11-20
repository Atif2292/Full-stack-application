package com.mail.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mail.model.MailEntity;


@Repository
public interface MailRepo extends CrudRepository<MailEntity, Long> {


    
}