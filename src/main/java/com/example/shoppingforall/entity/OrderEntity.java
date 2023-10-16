package com.example.shoppingforall.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Long id;

    @Column(name = "id_customer")
    private Long idCustomer;

    @Column(name = "id_transaction")
    private Long idTransaction;

    @Column(name = "id_product")
    private Long idProduct;

    @Column(name = "number_product")
    private String numberProduct; // Số sản phẩm

    @Column(name = "number_type_product")
    private String numberTypeProduct; // số loại sản phẩm

    @Column(name = "type_payment")
    private String typePayment;

    @Column(name = "date_order")
    private Timestamp dateOrder;

    @Column(name = "date_payment")
    private Timestamp datePayment;

    @Column(name = "status_order")
    private String statusOrder; // Trạng thái đơn hàng

    @Column(name = "discount_code")
    private String discountCode;

    @Column(name = "info_shipping")
    private String infoShipping;

    @Column(name = "price")
    private Long price;

    @Column(name = "total_amount")
    private Long totalAmount;

    @Column(name = "date_create_order")
    private Timestamp dateCreateOrder;

    @Column(name = "date_update")
    private Timestamp dateUpdate;

}
