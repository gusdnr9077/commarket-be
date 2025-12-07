package com.example.commarket.service;

import com.example.commarket.dto.ChangePasswordRequestDTO;
import com.example.commarket.dto.CreateUserRequestDTO;
import com.example.commarket.dto.LoginRequestDTO;
import com.example.commarket.dto.UserDetailResponse;

import java.math.BigInteger;

public interface UserService {
    //TC-signUp-01,02,03

    Long signUp(CreateUserRequestDTO requestDTO);

    //TC-Edit-01

    void updateNickname(Long userId, String newNickname);



    //TC-ChangePw-01,02
    void changePassword(Long userId, ChangePasswordRequestDTO requestDTO);

    //TC-DeleteAccount-01
    void deleteAccount(Long userId);

    //TC-Verify-04
    void completeEmailVerification(String email);

    //TC-Login-01,02
    UserDetailResponse login(LoginRequestDTO requestDTO);

    //TC-FindId-01,02
    void findId(String email);

}
