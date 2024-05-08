package com.example.zahir.service.impl;

import com.example.zahir.entity.UserEntity;
import com.example.zahir.model.ResponseModel;
import com.example.zahir.model.UserRequestModel;
import com.example.zahir.repository.UserRepository;
import com.example.zahir.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public ResponseModel userInsert(UserRequestModel userRequestModel) {
      ResponseModel responseModel = new ResponseModel();
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userRequestModel.getName());
        userRepository.save(userEntity);
        responseModel.setCode(200);
        responseModel.setMessage("success");
        return responseModel;
    }

//    @Override
//    public List<UserEntity> getAll() {
//        List<UserEntity> userList = userRepository.findAll();
//        return userList;
//    }

    @Override
    public List<UserEntity> getAll() {
        List<UserEntity> userList = userRepository.userList();
        return userList;
    }
}
