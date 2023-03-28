package stringtest;

import java.util.Scanner;

/*
	암호와 암호확인을 입력받아 
	서로 같은지 판별하고 또 암호의 길이가 6자 이상인지 판별하는
	프로그램을 작성해 봅니다.
 */
public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pwd;
		String chkPwd;
		System.out.print("암호를 입력하세요==>");
		pwd = sc.next();
		System.out.print("암호확인 입력하세요==>");
		chkPwd = sc.next();
		
		if(pwd.length() < 6  || !pwd.equals(chkPwd)) {
			System.out.println("암호가 잘못되었습니다.");
			return;
		}
		
		System.out.println("올바른 암호입니다.");
		System.out.println("암호:"+pwd);
				
	}
}











