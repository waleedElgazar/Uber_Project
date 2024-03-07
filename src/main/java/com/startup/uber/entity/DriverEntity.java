package com.startup.uber.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DRIVER")
public class DriverEntity extends BaseEntity{

    @Id
    @SequenceGenerator(name = "S_DRIVER")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID" , unique = true , nullable = false)
    private Long id;

    @Column(name = " driver_name")
    private String name;

    @Column(name = "driver_email")
    private String email;

    @Column(name = "driver_date")
    private Date dob;

    @Column(name = "driver_location")
    private String location;

}
