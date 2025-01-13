package com.korit.crud.dto.user;

import java.util.Scanner;

public class DeleteSignInUserRequestDto {

	// 비밀번호를 받을 것이다.
	private String password;
	
	public DeleteSignInUserRequestDto() {
		// 스캐너로 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("비밀번호 : ");
		this.password = scanner.nextLine();		
	}

	public String getPassword() {
		return password;
	}
	public boolean validate() {
		if(!isNotNull()) {
			// false로 잡혔다면
			System.out.println("모두 입력해주세요.");
			// 다음 동작을 할수 없도록 강제로 리턴
			return false;
		}
		if(!nicknameValidate()) {
			System.out.println("비밀번호는 비어있거나 공백으로만 구성할 수 없습니다.");
			return false;
		}
		// 둘다 아니라면 true이다.
		return true;
	}
	// 유효성 검사
	private boolean isNotNull() {
		// 공백x
		return password != null;
	}
	// 유효성 검사
	private boolean nicknameValidate() {
		// 빈문자열x
		return !password.isBlank();
	}
	
}
