package com.pocketpay.transaction.entity;


import lombok.*;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;
import java.sql.Time;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transaction_id")
    private Long id;

    @Column(name="status")
    private String status;

    @Column(name="sending_amount")
    private String sending_amount;

    @Column(name="user_id")
    private Long user_id;

    @Column(name="recieving_amount")
    private String recieving_amount;

    @Column(name="guaranted_rate")
    private String guaranted_rate;

    @Column(name="fee")
    private String Fee;

    @Column(name="time")
    private Time time;

    @Column(name="reference_no")
    private String reference_no;

    @Column(name="purpose")
    private String purpose;


    @Column(name="bank_IFSC_code")
    private String bank_IFSC_code;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "recipient_id")
    private Recipient recipient_id;

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", sending_amount='" + sending_amount + '\'' +
                ", recieving_amount='" + recieving_amount + '\'' +
                ", guaranted_rate='" + guaranted_rate + '\'' +
                ", Fee='" + Fee + '\'' +
                ", time=" + time +
                ", reference_no='" + reference_no + '\'' +
                ", purpose='" + purpose + '\'' +
                ", bank_IFSC_code='" + bank_IFSC_code + '\'' +
                ", recipient=" + recipient_id +
                '}';
    }
}
