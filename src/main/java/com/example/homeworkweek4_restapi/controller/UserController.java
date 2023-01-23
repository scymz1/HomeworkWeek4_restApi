package com.example.homeworkweek4_restapi.controller;

import com.example.homeworkweek4_restapi.pojo.entry.UserInfo;
import com.example.homeworkweek4_restapi.repository.UserRepository;
import com.example.homeworkweek4_restapi.service.UserService;
import com.example.homeworkweek4_restapi.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/userinfo")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(params = "first_name")
    public ResponseEntity<List<UserInfo>> getByFirstName(@RequestParam String first_name) {
        System.out.println(first_name);
        return new ResponseEntity<>(userService.getByFirstName(first_name), HttpStatus.OK);
    }

    @GetMapping(params = "last_name")
    public ResponseEntity<List<UserInfo>> getByLastName(@RequestParam String last_name) {
        return new ResponseEntity<>(userService.getByLastName(last_name), HttpStatus.OK);
    }

    @GetMapping(params = "middle_name")
    public ResponseEntity<List<UserInfo>> getByMiddleName(@RequestParam String middle_name) {
        return new ResponseEntity<>(userService.getByMiddleName(middle_name), HttpStatus.OK);
    }

    @GetMapping(params = "dob")
    public ResponseEntity<List<UserInfo>> getByDob(@RequestParam Date dob) {
        return new ResponseEntity<>(userService.getByDate(dob), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Long> insertUser(@RequestBody UserInfo userInfo) {
        return new ResponseEntity<>(userService.createUserInfo(userInfo), HttpStatus.OK);
    }
}
