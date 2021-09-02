package com.spring.springdemo;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdemoApplication.class, args);
        System.out.println("Welcome to spring security");

        String str = "java code decode java decode code";
        List<String> words = Arrays.asList(str.split(" "));
        //Map<String, Map<String, List<Person>>> peopleByStateAndCity
        //    = personStream.collect(Collectors.groupingBy(Person::getState,
        //    Collectors.groupingBy(Person::getCity)));

        //Map<String, Long> result = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> result = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }


}
