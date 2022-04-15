package com.infracm.tech.repository;

import com.infracm.tech.model.UserContact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserContactRepository extends CrudRepository<UserContact, Integer> {

    List<UserContact> findAll();

}
