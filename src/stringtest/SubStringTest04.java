package stringtest;

import java.util.Date;
import java.util.Scanner;

// 주민번호를 입력받아 나이를 구하여 출력하는 프로그램을 작성해 봅니다.
public class SubStringTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin;
		System.out.print("주민번호(하이픈포함)를 입력하세요==>");
		jumin = sc.next();
		int yy = Integer.parseInt(jumin.substring(0, 2));
		//800101-1234567
		int gender = Integer.parseInt(jumin.substring(7, 8));
		
		if(gender == 1 || gender == 2) {
			yy+=1900;
		}else {
			yy+=2000;
		}
		
		Date today = new Date();
		int thisYear = today.getYear()+1900;
		int age = thisYear - yy;
		System.out.println("주민번호:"+jumin);
		System.out.println("출생연도:"+yy);
		System.out.println("올해연도:"+thisYear);
		System.out.println("나이:"+age);		
	}
}



















