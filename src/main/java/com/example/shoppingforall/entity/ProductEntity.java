package com.example.shoppingforall.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Long id;

    @Column(name = "id_order")
    private Long idOrder;

    @Column(name = "desc_product")
    private String descProduct;

    @Column(name = "image")
    private String image;

    @Column(name = "quantity_remaining")
    private String quantityRemaining;

    @Column(name = "price")
    private Long price;

    @Column(name = "supplier")
    private String supplier;

    @Column(name = "year_manufacture")
    private String yearManufacture;

    @Column(name = "expiry")
    private Date expiry;

    @Column(name = "ingredient")
    private String ingredient;

    @Column(name = "discount_program")
    private String discountProgram;

    @Column(name = "product_type")
    private String productType;

    @Column(name = "userId_create")
    private BigInteger userIdCreate;
}
