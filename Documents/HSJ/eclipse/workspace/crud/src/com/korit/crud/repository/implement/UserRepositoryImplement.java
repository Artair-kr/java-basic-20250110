package com.korit.crud.repository.implement;

import com.korit.crud.entity.UserEntity;
import com.korit.crud.repository.UserRepository;

public class UserRepositoryImplement implements UserRepository{

	
	@Override
	public boolean existsById(String id) {
		for(UserEntity entity: DATABASE_LIST) {
			if(entity.getId().equals(id)) return true;
		}
		return false;
	}

	@Override
	public void save(UserEntity userEntity) {
		DATABASE_LIST.add(userEntity);		
	}

	@Override
	public UserEntity findById(String id) {
		// true, false 대신 인스턴스(객체)를 불러오기 위해 return entity;
		for(UserEntity entity: DATABASE_LIST) {
			if(entity.getId().equals(id)) return entity;
		}
		// 실패하면 빈칸
		return null;
	}

	@Override
	public void updateByNickname(String id, String nickname) {
		// foreach : 읽기만 가능 하지만, 주소를 통해 간접적으로는 가능하다.
		// 주소를 바꾸는것은 불가능하지만, 주소를 통해 간접적으로 바꾸는것은 가능하다.
		// entity안에는 주소가 들어있다.(DATABASE_LIST의)
		for(UserEntity entity : DATABASE_LIST) {
			if(entity.getId().equals(id)) {
				// 닉네임 변경
				// 주소를 찾아가서 바꾼다.
				entity.setNickname(nickname);
			}
		}
		
	}

	@Override
	public void deleteById(String id) {
		UserEntity userEntity = null;
			/*
			for(UserEntity entity: DATABASE_LIST) {
				if(entity.getId().equals(id)) userEntity = entity;
			}
			*/
			// 삭제한다.
			DATABASE_LIST.remove(userEntity);
		}

	@Override
	public void deleteOne(UserEntity userEntity) {
		DATABASE_LIST.remove(userEntity);	
		}
	}

