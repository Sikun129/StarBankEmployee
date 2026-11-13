package com.service.starbankemployee.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;

    private String lastname;
    @NotNull(message = "mail id not mandatory")
    @Column(unique = true)
    private String email;

    @NotNull(message = "gender is mandatory")
    private String gender;
    @NotNull(message = "number is mandatory")

    private  String phonenumber;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zipcode;




}
