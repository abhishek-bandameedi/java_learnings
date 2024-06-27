package com.pocketpay.transaction.dto;


import lombok.*;

import javax.persistence.Entity;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long user_id;

    private String name;

    private String password;

    private String email;

    private String account_type;

    private Double ph_no;

    private Date dob;

    private int business_id;

    private int address_id;

}
