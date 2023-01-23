package com.example.homeworkweek4_restapi.service;

import com.example.homeworkweek4_restapi.pojo.entry.UserInfo;

import java.sql.Date;
import java.util.List;

public interface UserService {
    List<UserInfo> getByFirstName(String name);

    List<UserInfo> getByLastName(String name);

    List<UserInfo> getByMiddleName(String name);

    List<UserInfo> getByDate(Date date);

    long createUserInfo(UserInfo newUser);
}
