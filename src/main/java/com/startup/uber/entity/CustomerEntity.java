package com.startup.uber.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity {
    @Id
    @SequenceGenerator(name = "S_CUSTOMER")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;
}
