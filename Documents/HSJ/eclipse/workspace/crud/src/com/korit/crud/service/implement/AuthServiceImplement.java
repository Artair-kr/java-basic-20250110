package com.korit.crud.service.implement;

import com.korit.crud.CrudApplication;
import com.korit.crud.dto.auth.SignInRequestDto;
import com.korit.crud.dto.auth.SignUpRequestDto;
import com.korit.crud.entity.UserEntity;
import com.korit.crud.repository.UserRepository;
import com.korit.crud.service.AuthService;

public class AuthServiceImplement implements AuthService {
	
	// DIP 구현 
	private final UserRepository userRepository;
	
	public AuthServiceImplement(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public void signUp(SignUpRequestDto requestDto) {
		// 아이디가 중복됐는지 저장소에서 확인
		String id = requestDto.getId();
		boolean existedId = userRepository.existsById(id);
		// - 중복된 아이디라면 '중복된 아이디입니다.' 출력 후 메서드 종료
		if(existedId) { // 존재하는 아이디라면
			System.out.println("중복된 아이디 입니다.");
			return;
		}
		/*
		// 해당 유저 정보를 저장소에 저장 후 '성공했습니다.' 출력
		String password = requestDto.getPassword();
		String nickname = requestDto.getPassword();
		UserEntity userEntity = new UserEntity(id, password, nickname);
		*/
		UserEntity userEntity = new UserEntity(requestDto);
		userRepository.save(userEntity);
		System.out.println("성공했습니다.");
	}

	@Override
	public void signIn(SignInRequestDto requestDto){
		// 아이디에 해당하는 정보가 있는지 확인 (인스턴스를 찾는다)
		// - 위 코드와는 다르게 true false보다 실재 그 인스턴스를 가져오는게 좋다.
		String id = requestDto.getId();
		UserEntity userEntity = userRepository.findById(id);
		
		// - 존재하지 않는다면 "로그인에 실패했습니다." 출력 후 메서드 종료
		if(userEntity == null) {
			System.out.println("로그인에 실패했습니다.");
			return;
		}
		// 찾은 정보의 비밀번호와 입력한 비밀번호가 같은지 확인
		String password =  requestDto.getPassword();
		String existPassword =  requestDto.getPassword();
		// - 같지 않다면 '로그인에 실패했습니다.' 출력 후 메서드 종료
		if(!existPassword.equals(password)) { // 같지 않다면
			System.out.println("로그인에 실패했습니다.");
			return;
		}
		// 로그인 정보 저장
		CrudApplication.SESSION = id;
		// '로그인 성공' 출력 
		System.out.println("로그인 성공");
	}
}