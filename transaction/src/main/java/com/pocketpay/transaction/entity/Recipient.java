package com.pocketpay.transaction.entity;


import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="recipient")
public class Recipient {
    @Override
    public String toString() {
        return "Recipient{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", acc_no=" + acc_no +
                ", ifsc_code=" + ifsc_code +
                ", account_type=" + account_type +
                ", email='" + email + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Recipient_id")
    private Long id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="acc_no")
    private Long acc_no;

    @Column(name="ifsc_code")
    private Long ifsc_code;

    @Column(name="account_type")
    private Long account_type;

    @Column(name="email")
    private String email;


}
