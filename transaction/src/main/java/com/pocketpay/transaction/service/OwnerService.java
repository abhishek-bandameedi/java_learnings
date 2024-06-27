package com.pocketpay.transaction.service;

import com.pocketpay.transaction.dto.OwnerDto;

import java.util.List;

public interface OwnerService {

    OwnerDto createOwner(OwnerDto ownerDto);

    List<OwnerDto> getAllOwner();
}
