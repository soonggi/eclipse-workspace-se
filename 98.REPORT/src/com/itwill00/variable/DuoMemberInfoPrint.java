package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		 *1. DuoMember 1명 데이타를 담을 변수선언
		 *2. DuoMember 1명 데이타를 변수에 대입
		 *3. DuoMember 1명 데이타를 출력
		 */

		int 회원번호;
		회원번호 = 1;
		int 주민번호앞 = 941227;
		int 주민번호뒤 = 111111;
		//주민번호 입력 시 한줄로 입력하면 출력 시 숫자가 달라져서 두개로 나눔
		String 이름 = "황순근";
		int 나이;
		나이 = 28;
		int 결혼횟수 = 0;
		String 성별 = "남";
		boolean 흡연여부 = false;

		System.out.println("회원번호 : " +회원번호);
		System.out.println("주민번호 : " +주민번호앞 +"-"+주민번호뒤);
		System.out.println("이름 : " +이름);
		System.out.println("나이 : " +나이);
		System.out.println("결혼횟수 : " +결혼횟수);
		System.out.println("성별 : " +성별);
		System.out.println("흡연여부 : " +흡연여부);

	}

}
