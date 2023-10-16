package com.example.shoppingforall.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_account")
    private Long id;

    @Column(name = "id_customer")
    private Long idCustomer;

    @Column(name = "name")
    private String name;

    @Column(name = "pass_word")
    private String passWord;

    @Column(name = "role")
    private String role;

    @Column(name = "account_status")
    private String accontStatus;
}
