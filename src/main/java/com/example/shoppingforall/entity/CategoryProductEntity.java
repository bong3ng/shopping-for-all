package com.example.shoppingforall.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_category_product")
public class CategoryProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_category")
    private BigInteger idCategory;

    @Column(name = "name_category")
    private String nameCategory;

    @Column(name = "logo")
    private String logo;
}
