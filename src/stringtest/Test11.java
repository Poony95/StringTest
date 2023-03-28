package stringtest;

import java.util.Scanner;

/*
	사용자 한테 암호와 암호확인을 입력받아 
	6글자 이상, 암호와 암호확인이 동일하고, 숫자포함, 특수포함
	하고 있는지 판별하는 프로그램을 작성	
 */

public class Test11 {
	public static boolean isContainSpecial(String data) {
		char []sp = {'!','@','#','$','%',
		               '^','&','*','(',')',',','.'};
		boolean flag = false;
		for(int i=0; i<data.length(); i++) {
			char ch = data.charAt(i);
			for(int j=0; j<sp.length; j++) {
				if(ch == sp[j]) {					
					return true; 
				}
			}
		}
		
		return flag;
	}
	
	public static boolean isContainDigit(String data) {
		boolean flag = false;
		for(int i=0; i<data.length(); i++) {
			char ch = data.charAt(i);
			if(ch >= '0' && ch <= '9') {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pwd, chkPwd;
		System.out.println("암호를 입력==>");
		pwd = sc.next();
		System.out.println("암호 확인을 입력==>");
		chkPwd = sc.next();
		if(pwd.length() >= 6
				&& pwd.equals(chkPwd) 
				&& isContainDigit(pwd) 
				&& isContainSpecial(pwd))
		{
			System.out.println("올바른 암호입니다. " + pwd);
		}else {
			System.out.println("올바른 암호가 아니거나, 암호와 암호확인 다릅니다.");
		}
	}

}

















