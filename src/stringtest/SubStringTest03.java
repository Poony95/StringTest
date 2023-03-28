package stringtest;

import java.util.Scanner;

// 사용자 한테 주민번호(하이픈포함)를 입력받아 
// 성별을 파악하는 프로그램을 작성 해 봅니다.

public class SubStringTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin;
		System.out.print("주민번호(하이픈 포함)를 입력==>");
		jumin = sc.next();
		//800101-1234567
		String check = jumin.substring(7, 8);
		if(check.equals("1") || check.equals("3")) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}
}












