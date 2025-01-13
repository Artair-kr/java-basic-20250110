package com.korit.crud.repository;

import java.util.ArrayList;
import java.util.List;

import com.korit.crud.entity.UserEntity;

// Repository : 데이터베이스 작업을 위한 모듈(레이어)
// 데이터베이스에 삽입, 조회, 수정, 삭제 작업을 처리

public interface UserRepository {
	// 리스트의 요소중에서 아이디가 사용자가 입력한값과 일치하는 값이 있는지 확인해야한다.
	List<UserEntity> DATABASE_LIST = new ArrayList<>();
	
	List<UserEntity> SESSION = new ArrayList<>();
	
	void save(UserEntity userEntity);
	// true, false
	boolean existsById(String id);
	
	// 인스턴스 찾아서 확인
	UserEntity findById(String id);
	
	void updateByNickname(String id, String nickname);
	
	// 아이디로 삭제를 하겠다.
	void deleteById(String id);
	
	// 아이디 조회
	void deleteOne(UserEntity userEntity);
}

