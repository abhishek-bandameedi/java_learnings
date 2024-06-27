package com.pocketpay.transaction.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long user_id;

    @Column(name="name")
    private String name;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;

    @Column(name="account_type")
    private String account_type;


    @Column(name="ph_no")
    private Double ph_no;

    @Column(name="dob")
    private Date dob;

    @Column(name="business_business_id")
    private int business_id;

    @Column(name="address_address_id")
    private int address_id;

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", email='" + email + '\'' +
                ", account_type='" + account_type + '\'' +
                ", ph_no=" + ph_no +
                ", dob=" + dob +
                ", business_id=" + business_id +
                ", address_id=" + address_id +
                '}';
    }
}
