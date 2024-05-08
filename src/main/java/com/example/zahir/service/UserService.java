package com.example.zahir.service;

import com.example.zahir.entity.UserEntity;
import com.example.zahir.model.ResponseModel;
import com.example.zahir.model.UserRequestModel;

import java.util.List;

public interface UserService {
    ResponseModel userInsert(UserRequestModel userRequestModel);
    List<UserEntity> getAll();
}
