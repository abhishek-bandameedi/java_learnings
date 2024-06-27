package com.pocketpay.transaction.dto;


import lombok.*;

import javax.persistence.Entity;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RecipientDto {
    private Long id;

    private String first_name;

    private String last_name;

    private Long acc_no;

    private Long ifsc_code;

    private Long account_type;

    private String email;



}
