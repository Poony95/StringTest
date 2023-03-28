package stringtest;

import java.util.Date;
import java.util.Scanner;

/*
	사용자 한테 이름, 주민번호를 입력받아 
	무료 암검진대상자 인지 판별하여 결과를 출력하는 프로그램을 작성합니다.
	<< 처리조건 >>
	나이가 40세이상이고 올해가 홀수연도이면 홀수연도에 태어나고
	올해가 짝수연도이면 짝수연도에 태어난 사람이 무료암검진 대상자 입니다.
	
	<< 무료암검진 항목 >>
	40세 이상이면 위암,간암,일반암
	40세 이상 여자이면 위암,간암,일반암,유방암,자궁암
	50세 이상이면 위암,간암,일반암,대장암
	50세 이상 여자이면 위암,간암,일반암,유방암,자궁암,대장암
 */
public class CancerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String jumin;
		String chekUp = "위암,간암,일반암";
		Date today = new Date();
		int thisYear = today.getYear()+1900;
		System.out.print("이름을 입력==>");
		name = sc.next();
		System.out.print("주민번호(하이픈포함)를 입력==>");
		jumin = sc.next();
		
		int gender = Integer.parseInt(jumin.substring(7, 8));
		int year = Integer.parseInt(jumin.substring(0, 2));
		
		if(gender == 1 || gender == 2) {
			year += 1900;
		}else {
			year += 2000;
		}
		int age = thisYear-year;
		
		System.out.println("*** 결과 판정 *** ");
		System.out.println("이름:"+name);
		System.out.println("주민번호:"+jumin);
		System.out.println("출생연도:"+year);
		System.out.println("나이:"+age);
		System.out.println("올해연도:"+thisYear);
		System.out.println("--------------------------------------");		
		if( age < 40 || thisYear % 2 != year % 2  ) {
			System.out.println("무료 암검진 대상자가 아닙니다.");
			return;
		}		
		if(age >= 50) {
			chekUp += ",대장암";
		}		
		if(gender == 2 || gender == 4) {
			chekUp += ",유방암,자궁암";
		}		
		System.out.println("무료암검진 대상자 입니다.");
		System.out.println("검진항목은 "+chekUp+"입니다.");		
	}
}















