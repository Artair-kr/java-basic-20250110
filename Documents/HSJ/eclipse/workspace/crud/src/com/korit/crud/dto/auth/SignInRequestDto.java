package com.korit.crud.dto.auth;

import java.util.Scanner;

public class SignInRequestDto {
	private String id;
	private String password;
	
	public SignInRequestDto() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ID : ");
		this.id = scanner.nextLine();
		System.out.print("Password : ");
		this.password = scanner.nextLine();
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}
	
	public boolean validate() {
		// 값 입력 여부 확인
		if(!isNotNull()) {
			System.out.println("모두 입력해주세요.");
			return false;
		}
		// 추가 가능(유지보수가능)
		return true;
	}
	
	private boolean isNotNull() {
		return id != null &&  password != null;
	}
}
