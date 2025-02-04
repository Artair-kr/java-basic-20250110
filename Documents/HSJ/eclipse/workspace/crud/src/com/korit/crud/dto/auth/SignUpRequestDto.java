package com.korit.crud.dto.auth;

import java.util.Scanner;

// DTO (Data Transfer Object) : 모듈간 데이터 전송을 위한 객체
public class SignUpRequestDto {
	// DTO 객체 정의
	// 무결성, 보호, 은닉이 불가능한 형태
	// 캡슐화를 하여 위의 사항이 가능하도록 한다.
	/*
	String id;
	String password;
	String passwordCheck;
	String nickname;
	*/
	// 캡슐화
	private String id;
	private String password;
	private String passwordCheck;
	private String nickname;
	// 인스턴스 생성과 동시에 초기화를 하려면 생성자를 만들어준다.
	// 값을 불러오는 메서드 : getter
	// 특정 값 변경하는 메서드 : setter
	public SignUpRequestDto() {
		// super(); 부모클래스의 기본생성자는 없어도 자동으로 호출한다.
		/*
		this.id = id;
		this.password = password;
		this.passwordCheck = passwordCheck;
		this.nickname = nickname;
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("ID : ");
		this.id = scanner.nextLine();
		System.out.print("Password : ");
		this.password = scanner.nextLine();
		System.out.print("PasswordCheck  : ");
		this.passwordCheck = scanner.nextLine();
		System.out.print("NickName : ");
		this.nickname = scanner.nextLine();
	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getPasswordCheck() {
		return passwordCheck;
	}
	public String getNickname() {
		return nickname;
	}
	@Override
	public String toString() {
		return "SignUpRequestDto [id=" + id + ", password=" + password + ", passwordCheck=" + passwordCheck
				+ ", nickname=" + nickname + "]";
	}	
	
	public boolean validate() { // 순서대로 검사
		if(!isNotNull()) { // 모두 빈칸이 아니라면, 이 결과가 false 라면(빈칸이라면)
			System.out.println("모두 입력해 부세요");
			return false;
		}
		if(!idValidate()) {
			System.out.println("ID는 6자 이상이어야 합니다.");
			return false;
		}
		if(!passwordValidate()) {
			System.out.println("Password는 8자 이상이어야 합니다.");
			return false;
		}
		if(!passwordCheckValidate()) {
			System.out.println("Password와 일치하지 않습니다.");
			return false;
		}
		if(nicknameValidate()) {
			System.out.println("nickname은 비어있거나 공백만 있다면 구성할 수 없습니다.");
			return false;
		}
		return true;
	}
	
	private boolean idValidate() { // ID값 유효성 검사
		return id.length() >= 6;
	}
	
	private boolean passwordValidate() {
		return password.length() >= 8;
	} 
	
	private boolean passwordCheckValidate() { // 패스워드와 패스워드체크가 같은지 비교
		return password.equals(passwordCheck);
	} 
	
	private boolean nicknameValidate() {
		return nickname.isBlank(); // 문자열이 비어있거나, 공백(띄워쓰기)("   ")가 있으면 반환, 비워있으면 안된다.
		// nickname.isEmpty(); // 길이가 0이면("")이면 true 를 반환
	}
	
	private boolean isNotNull(){ // 빈칸이면 안된다는 규칙
		return id != null && password != null && passwordCheck != null && nickname != null;
	}
	
}
