package com.geekster.ECommerceAPI.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Address_Table")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int id;
    private String name;
    private String landMark;
    private String phoneNumber;
    private String zipcode;
    private String state;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User userId;
}
