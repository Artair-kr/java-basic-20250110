package com.korit.crud.service.implement;

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
}