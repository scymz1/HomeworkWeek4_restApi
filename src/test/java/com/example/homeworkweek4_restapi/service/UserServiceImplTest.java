package com.example.homeworkweek4_restapi.service;

import com.example.homeworkweek4_restapi.HomeworkWeek4RestApiApplication;
import com.example.homeworkweek4_restapi.pojo.entry.UserInfo;
import com.example.homeworkweek4_restapi.repository.UserRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.sql.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK,
//classes = HomeworkWeek4RestApiApplication.class)
//@AutoConfigureMockMvc
//@TestPropertySource(
//        locations = "classpath:application-integrationtest.properties"
//)
@DataJpaTest
class UserServiceImplTest {

    //private EntityManager entityManager;
    private UserRepository repository;

    @Autowired
    public UserServiceImplTest(UserRepository userRepository){
        //this.entityManager = entityManager;
        this.repository = userRepository;
    }

    @Test
    void getByFirstName() throws Exception {
        //entityManager.persist(new UserI);
        repository.save(new UserInfo(1, "Minghao", "Zhou", "", null));
        List<UserInfo> userInfo = repository.findByFirstName("Minghao");
        assertEquals(userInfo.get(0).getFirstName(), "Minghao");
    }

    @Test
    void getByDate() {
    }

    @Test
    void createUserInfo() {
        Long c = repository.count();
        repository.save(new UserInfo(2, "Minghao", "Zhou", "", null));
        Long c2 = repository.count();
        assertEquals(c +1, c2);
    }
}