package com.korit.crud.dto.user;

import java.util.Scanner;

public class PatchSignInUserRequestDto {
	
	// 닉네임을 받을것이다.
	private String nickname;

	public PatchSignInUserRequestDto() {
		// 스케너로 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("닉네임 : ");
		this.nickname = scanner.nextLine();
	}
	// Getter
	public String getNickname() {
		return nickname;
	}
	public boolean validate() {
		if(!isNotNull()) {
			// false로 잡혔다면
			System.out.println("모두 입력해주세요.");
			// 다음 동작을 할수 없도록 강제로 리턴
			return false;
		}
		if(!nicknameValidate()) {
			System.out.println("닉네임은 비어있거나 공백으로만 구성할 수 없습니다.");
			return false;
		}
		// 둘다 아니라면 true이다.
		return true;
	}
	
	// 유효성 검사
	private boolean isNotNull() {
		// 공백x
		return nickname != null;
	}
	// 유효성 검사
	private boolean nicknameValidate() {
		// 빈문자열x
		return !nickname.isBlank();
	}
}
