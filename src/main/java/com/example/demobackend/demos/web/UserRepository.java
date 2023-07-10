package com.example.demobackend.demos.web;

/**
 * ClassName: UserRepository
 * Package: com.example.demobackend.demos.web
 * Description:
 *
 * @Author 冯嘉声
 * @Create 2023/5/25 11:12
 * @Version 1.0
 */
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {}
