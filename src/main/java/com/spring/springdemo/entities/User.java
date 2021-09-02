package com.spring.springdemo.entities;


import com.sun.tracing.dtrace.ArgsAttributes;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "user_details")
public class User {

    @Id
    @GeneratedValue
    private int id;
    @NonNull()
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String role;
    private boolean enabled;
    private String imageUrl;
    private String about;


}
