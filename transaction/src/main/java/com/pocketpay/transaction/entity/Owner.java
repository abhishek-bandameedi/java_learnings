package com.pocketpay.transaction.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="owner")
public class Owner {
    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", owner_type='" + owner_type + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", country='" + country + '\'' +
                ", Recipient_id=" + Recipient_id +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="owner_id")
    private Long id;

    @Column(name="owner_type")
    private String owner_type;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="date_of_birth")
    private Date date_of_birth;

    @Column(name="country")
    private String country;

    @Column(name="Recipient_id")
    private Long Recipient_id;
}
