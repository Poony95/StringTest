package stringtest;

import java.util.Scanner;

// email :  tiger@naver.com
//			kim@gmail.com
// 사용자 한테 이메일을 입력받아 id만 추출하여 출력 해 봅니다.
// substring, indexOf


public class IdFromEmail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email;
		System.out.print("이메일을 입력하시오==>");
		email = sc.next();
		int n = email.indexOf("@");
		String id  = email.substring(0, n);
		System.out.println(id);
	}
}




















