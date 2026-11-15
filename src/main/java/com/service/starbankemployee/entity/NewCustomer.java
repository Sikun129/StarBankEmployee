package com.service.starbankemployee.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "NewCustomers")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "firstname is mandatory")
    private String firstname;;
    private String lastname;

    @Email(message = "mail id is manadatory")
    @Column(unique = true)
    private  String email;

    private String phonenumber;
    private String gender;
    private String address;
    private String city;
    private String state;
    private String zipcode;



}
