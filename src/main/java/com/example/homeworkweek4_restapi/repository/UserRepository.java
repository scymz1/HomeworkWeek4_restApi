package com.example.homeworkweek4_restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.homeworkweek4_restapi.pojo.entry.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, Long> {
    List<UserInfo> findByFirstName(String name);
    List<UserInfo> findByLastName(String name);
    List<UserInfo> findByMiddleName(String name);
    List<UserInfo> findByDob(Date date);
}
