package com.korit.crud.controller;

import com.korit.crud.dto.auth.SignInRequestDto;
import com.korit.crud.dto.auth.SignUpRequestDto;

// Controller : 클라이언트와 서버간의 접점에 해당하는 모듈(레이어)
// 요청(입력)에 대한 검증, 응답(출력)에 대한 분기 처리
// 어떤 화면을 내보내줄지 결정(분기 처리)

// 인증, 인가 작업(회원가입, 로그인)
// DIP에 의해 의존성을 추상화에 의존하기 위해 인터페이스로 먼저 정의를 한다.
// DIP : 의존성 역전 원칙 - 상위 모듈(crudAplication)이 하위 모듈(AuthController)에 의존해서는 안된다.
// 추상화에 의존하게 만든다.
public interface AuthController {
	// 회원가입 기능
	// 서로 다른 패키지에 있다.
	void signUp(SignUpRequestDto requestDto);
	// 로그인
	void signIn(SignInRequestDto requestDto);

}
