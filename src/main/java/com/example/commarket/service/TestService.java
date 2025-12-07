//package com.example.commarket.service;
//
//import com.example.commarket.dto.TestDto;
//import com.example.commarket.entity.User;
//import com.example.commarket.repository.UserRepository;
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//@Transactional(readOnly = true)
//public class TestService {
//    private  final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;
//    private final EmailService emailService;
//
//    @Transactional
//    public Long signUP(UserSignUpRequestDto requestDto){
//        //TC-SignUp-02 이메일 중복 검사
//        if(UserRepository.findByEmail(requestDto.getEmail()).isPresent()){
//            throw new IllegalArgumentException("이미 존재하는 이메일입니다.");
//        }
//        //TC-SignUp-03:비밀번호 확인
//        if(!requestDto.getPassword_hash().equals(requestDto.getPasswordConfirm())){
//            throw new IllegalArgumentException("비밀번호와 확인 값이 일치하지 않습니다.");
//        }
//
//        User newUser = User.builder()
//                .email(requestDto.getEmail())
//                .password(passwordEncoder.encode(requestDto,getPassword_hash()))
//                .username(requestDto.getUsername())
//                .emialVerified(false)
//                .build();
//        User savedUser = UserRepository.save(newUser);
//        return savedUser.getId(); //TC-SignUp-01:user 테이블에 새로운 회원 데이터 입력
//    }
//    @Transactional
//    public void updateUsername(Long userId, String newUsername){
//        if(UserRepository.existsByUsername(newUsername)){
//            throw new IllegalArgumentException("이미 사용 중인 닉네임입니다.");
//        }
//        User user = UserRepository.findById(userId)
//                .orElseThrow(()-> new IllegalArgumentException("사용자를 찾을 수 없습니다."));
//    }
//
//    public TestDto testServiceMethod(String str){
//        TestDto testDto = new TestDto(str);
//
//        return testDto;
//    }
//}
