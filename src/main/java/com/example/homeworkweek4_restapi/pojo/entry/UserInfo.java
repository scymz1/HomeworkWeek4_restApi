package com.example.homeworkweek4_restapi.pojo.entry;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "users")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "dob")
    @DateTimeFormat(pattern="dd/MM/yyyyy")
    private Date dob;

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + firstName + " " +middleName + " " + lastName + "]";
    }


}
