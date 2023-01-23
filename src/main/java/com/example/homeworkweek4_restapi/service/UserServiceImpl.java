package com.example.homeworkweek4_restapi.service;

import com.example.homeworkweek4_restapi.pojo.entry.UserInfo;
import com.example.homeworkweek4_restapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<UserInfo> getByFirstName(String name) {
        return this.userRepository.findByFirstName(name);
    }

    @Override
    public List<UserInfo> getByLastName(String name) {
        return this.userRepository.findByLastName(name);
    }

    @Override
    public List<UserInfo> getByMiddleName(String name) {
        return this.userRepository.findByMiddleName(name);
    }


    @Override
    public List<UserInfo> getByDate(Date date) {
        return this.userRepository.findByDob(date);
    }

    @Override
    public long createUserInfo(UserInfo newUser) {
        userRepository.save(newUser);
        return newUser.getId();
    }
}
