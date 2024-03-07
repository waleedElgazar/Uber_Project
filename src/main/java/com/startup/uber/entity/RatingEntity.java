package com.startup.uber.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "RATING")
public class RatingEntity extends BaseEntity{

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @SequenceGenerator(name = "s_RATING")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUSTOMER_ID")
    private CustomerEntity customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DRIVER_ID")
    private DriverEntity driverEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TRIP_ID")
    private TripEntity trip;

    @Column(name = "rating_rate")
    private int rate;

    @Column(name = "rating_feedback")
    private String feedback;



}
