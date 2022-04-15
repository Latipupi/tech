package com.infracm.tech.controller;

import com.infracm.tech.model.User;
import com.infracm.tech.repository.UserRepository;
import com.infracm.tech.util.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/get-all-user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllUser() {

        log.info("Get All user..");

        List<User> user = userRepository.findAll();

        return BaseResponse.jsonResponse(HttpStatus.OK, "00", true, "Get User Succesfully", user);
    }
}
