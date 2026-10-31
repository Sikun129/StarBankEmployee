package com.service.starbankemployee.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empid;

    @Column(name = "firstname", nullable = false)
    private String firstname;

    private String middlename;

    @Column(name = "Lastname" , nullable = false)
    private String lastrname;

    private String surname;

    @NotBlank(message = "Gender name is mandatory")
    private String gender;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email name is mandatory")
    @Column(unique = true)
    private String email;

    @Column(unique = false)
    private String department;
    @NotBlank(message = "Phone-number is mandatory")
    private Long phonenumber;

    private Double salary;

    @Column(name = "branch_code")
    private String branchCode;

    private  String address;
    private String city;
    private String state;

    @NotBlank(message = "zip-code is manadatory")
    private String zipcode;






    
}
