package com.korit.crud.controller;

import com.korit.crud.dto.user.DeleteSignInUserRequestDto;
import com.korit.crud.dto.user.PatchSignInUserRequestDto;

public interface UserController {
	// UserService와 동일하게 입력
	void getSignInUser();
	void patchSignInUser(PatchSignInUserRequestDto requestDto);
	void deleteSignInUser(DeleteSignInUserRequestDto requestDto);
}
