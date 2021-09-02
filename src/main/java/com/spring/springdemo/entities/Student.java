package com.spring.springdemo.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_student",uniqueConstraints = @UniqueConstraint(name = "emailid_unique",columnNames = "email_address"))
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long studentId;
    private String firstName;
    private String lastname;
    @Column(name="email_address")
    private String emailId;
    private String  guardianName;
    private String guardianEmailId;
    private String guardianMobile;
}
