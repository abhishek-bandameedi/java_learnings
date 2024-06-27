package com.pocketpay.transaction.dto;


import com.pocketpay.transaction.entity.Recipient;
import lombok.*;

import javax.persistence.Entity;
import java.sql.Time;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {

    private Long id;

    private String status;

    private String sending_amount;

    private Long user_id;

    private String guaranted_rate;

    private String recieving_amount;

    private String Fee;

    private Time time;

    private String reference_no;

    private String purpose;

    private String bank_IFSC_code;

    private Recipient recipient_id;


}
