package com.springboot.jpa.hibernate.h2.example;

import com.springboot.jpa.hibernate.h2.example.student.Student;
import com.springboot.jpa.hibernate.h2.example.student.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2JPAWithHibernateAndH2Application implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger("JDBC logger");

    @Autowired
    StudentRepository studentRepository;


    @Override
    public void run(String... args) {
        logger.info("Student id 10001 -> {}", studentRepository.findById(10001L));

        logger.info("Inserting -> {}", studentRepository.save(new Student(100010L, "John", "ABC123")));

        logger.info("Updating -> {}", studentRepository.save(new Student(10001L, "New name", "New passport")));

        studentRepository.deleteById(10002L);

        logger.info("All users -> {}", studentRepository.findAll());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2JPAWithHibernateAndH2Application.class, args);
    }

}
