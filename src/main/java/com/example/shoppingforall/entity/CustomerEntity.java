package com.example.shoppingforall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private Long id;

    @Column(name = "id_order")
    private Long idOrder;

    @Column(name = "id_transaction")
    private Long idTransaction;

    @Column(name = "id_account")
    private Long idAccount;

    @Column(nullable = false, length = 100, name = "full_name")
    private String fullName;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birthday")
    private Date birthDay;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "image")
    private String image;

    @Column(name = "icNumber")
    private String icNumber;

    @Column(name = "ratings")
    private String ratings;

    @Column(name = "accountBank")
    private String accountBank;

}
