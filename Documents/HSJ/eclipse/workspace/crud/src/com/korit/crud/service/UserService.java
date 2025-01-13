package com.korit.crud.service;

import com.korit.crud.dto.user.DeleteSignInUserRequestDto;
import com.korit.crud.dto.user.PatchSignInUserRequestDto;

public interface UserService {
	// 입력이 없어 매개변수 입력 x
	void getSignInUser(String id);
	void patchSignUser(PatchSignInUserRequestDto requestDto, String id);
	void getSignInUser();
	void deleteSignInUser(DeleteSignInUserRequestDto requestDto, String id);
}
