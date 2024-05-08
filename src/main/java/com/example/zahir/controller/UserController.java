package com.example.zahir.controller;

import com.example.zahir.entity.UserEntity;
import com.example.zahir.model.ResponseModel;
import com.example.zahir.model.UserRequestModel;
import com.example.zahir.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/shaheer")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public ResponseModel insert(@RequestBody UserRequestModel userRequestModel){
    return userService.userInsert(userRequestModel);
    }

    @GetMapping("/getAllUsers")
    public List<UserEntity> getAll(){
        return userService.getAll();
    }


}
