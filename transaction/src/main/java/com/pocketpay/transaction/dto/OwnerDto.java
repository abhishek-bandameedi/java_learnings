package com.pocketpay.transaction.dto;


import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OwnerDto {

    private Long id;

    private String owner_type;

    private String first_name;

    private String last_name;

    private Date date_of_birth;

    private String country;

    private Long Recipient_id;


}
