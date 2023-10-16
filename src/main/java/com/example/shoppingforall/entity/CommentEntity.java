package com.example.shoppingforall.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comment")
    private Long id;

    @Column(name = "id_customer")
    private BigInteger idCusomer;

    @Column(name = "content")
    private String content;

    @Column(name = "evaluate")
    private String evaluate;

    @Column(name = "date_comment")
    private Timestamp dateComment;
}
