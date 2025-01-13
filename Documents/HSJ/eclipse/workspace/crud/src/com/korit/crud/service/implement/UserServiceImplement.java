package com.korit.crud.service.implement;

import com.korit.crud.CrudApplication;
import com.korit.crud.dto.user.DeleteSignInUserRequestDto;
import com.korit.crud.dto.user.PatchSignInUserRequestDto;
import com.korit.crud.entity.UserEntity;
import com.korit.crud.repository.UserRepository;
import com.korit.crud.service.UserService;

public class UserServiceImplement implements UserService{
	
	private final UserRepository userRepository;
	
	public UserServiceImplement(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void patchSignUser(PatchSignInUserRequestDto requestDto, String id) {
		boolean existedUser = userRepository.existsById(id);
		if(!existedUser) {
			System.out.println("존재하지 않는 아이디 입니다.");
			return;
		}	
		String nickname = requestDto.getNickname();
		userRepository.updateByNickname(id, nickname);
		System.out.println("성공했습니다.");	
	}

	@Override
	public void getSignInUser() {
		
	}

	@Override
	public void getSignInUser(String id) {
	    // id가 null이면 로그인된 사용자 정보가 없다는 메시지를 출력
	    if (id == null) {
	        System.out.println("로그인이 되어 있지 않습니다.");
	        return;
	    }
	    
	    // id가 null이 아니면 사용자 정보를 가져옴
	    UserEntity userEntity = userRepository.findById(id);
	    
	    if (userEntity == null) {
	        System.out.println("존재하지 않는 아이디입니다.");
	    } else {
	        System.out.println("아이디 : " + userEntity.getId() + " / 닉네임: " + userEntity.getNickname());
	    }	
		
	}

	@Override
	public void deleteSignInUser(DeleteSignInUserRequestDto requestDto, String id) {
		UserEntity userEntity = userRepository.findById(id);
		if(userEntity == null) {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
		String password = requestDto.getPassword();
		String existPassword = userEntity.getPassword();
		if(!existPassword.equals(password)) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		userRepository.deleteOne(userEntity);
		// 로그아웃이 되었다.
		// null이 아니라면 로그인이 되어있다
		CrudApplication.SESSION = null;
		System.out.println("삭제되었습니다.");
	}
}
