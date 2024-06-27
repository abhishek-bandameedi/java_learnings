package com.pocketpay.transaction.service;

import com.pocketpay.transaction.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto getUserById(Long id);

    List<UserDto> getAllUser();
}
