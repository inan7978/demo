package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//            Student inan = new Student(
//
//                    "inan", "inan@gmail.com", LocalDate.of(1999, Month.JULY, 7)
//
//            );
//
//            Student alex = new Student(
//
//                    "alex", "alex@gmail.com", LocalDate.of(1899, Month.JUNE, 9)
//
//            );
//
//            repository.saveAll(
//                    List.of(inan, alex)
//            );
//        };
//    }
}
