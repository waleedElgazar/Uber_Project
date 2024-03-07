package com.startup.uber.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CUSTOMER")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity extends BaseEntity{
    @Id
    @SequenceGenerator(name = "S_CUSTOMER")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "customer_name)")
    private String name;

    @Column(name = "customer_email")
    private String email;


}
