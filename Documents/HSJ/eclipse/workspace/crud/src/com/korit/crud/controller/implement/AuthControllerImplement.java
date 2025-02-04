package com.korit.crud.controller.implement;

import com.korit.crud.controller.AuthController;
import com.korit.crud.dto.auth.SignInRequestDto;
import com.korit.crud.dto.auth.SignUpRequestDto;
import com.korit.crud.service.AuthService;

public class AuthControllerImplement implements AuthController {
	
	private final AuthService authService;
	
	public AuthControllerImplement(AuthService authService){
		this.authService = authService;
		}
	
	@Override
	// void : 타입없음, 반환값이 없다.
	// signUp을 강제로 종료시키고싶으면 return
	public void signUp(SignUpRequestDto requestDto) {
		if(requestDto == null) {
			System.out.println("오류가 발생했습니다.");
			return;
		}
		if(!requestDto.validate()) return; // 실패하면 return
		authService.signUp(requestDto);
	}

	@Override
	public void signIn(SignInRequestDto requestDto) {
		if(requestDto == null) {
			System.out.println("오류가 발생했습니다.");
			return;
		}
		if(!requestDto.validate()) return; // 실패하면 return
		
		authService.signIn(requestDto);
	}
}
