package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//This section is used when we don't have db with us
// Using strings here avoids the "package does not exist" compilation error
@SpringBootApplication
//        (excludeName = {
//                "org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration",
//                "org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration",
//                "org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration"
//        }
//)
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}