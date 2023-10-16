package com.example.shoppingforall.entity;

import com.thoughtworks.qdox.model.expression.Or;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_transaction")
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaction")
    private Long id;

    @Column(name = "id_customer")
    private Long idCustomer;

    @Column(name = "id_order")
    private Long idOrder;

    @Column(name = "date_created")
    private Timestamp dateCreated;
}
