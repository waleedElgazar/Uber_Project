package com.startup.uber.entity;

import com.startup.uber.enums.PaymentMethodEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PAYMENT")
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity extends BaseEntity{

    @Id
    @SequenceGenerator(name = "S_PAYMENT")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @OneToOne(mappedBy = "paymentEntity")
    private TripEntity trip;

    @Enumerated(EnumType.STRING)
    @Column(name = "PAYMENT_METHOD")
    private PaymentMethodEnum paymentMethod;

    @Column(name = "AMOUNT")
    private double amount;


    @Override
    public String toString() {
        return "PaymentEntity{" +
                "id=" + id +
                ", trip=" + trip +
                ", paymentMethodEnum=" + paymentMethod +
                ", amount=" + amount +
                '}';
    }
}
