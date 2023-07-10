package com.example.demobackend.demos.web;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;


import javax.persistence.*;

/**
 * ClassName: User
 * Package: com.example.demobackend.demos.web
 * Description:
 *
 * @Author 冯嘉声
 * @Create 2023/5/25 11:06
 * @Version 1.0
 */

@Entity
@Table(name = "users")
public class User {

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private String email;

    public User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // getter 和 setter



    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
