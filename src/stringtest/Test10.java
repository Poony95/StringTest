package stringtest;

import java.util.Scanner;

/*
	문자열 데이터를 매개변수로 전달받아 
	그 문자열 안에 특수문자( !@#$%^&*(),. )를 포함하고 있는지
	판별하는 메소드를 만들고 테스트해 봅니다.
 */
public class Test10 {
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data ;
		System.out.print("문자열 입력==>");
		data = sc.next();
		if(isContainSpecial(data)) {
			System.out.println("특수문자 포함:"+data);			
		}else {
			System.out.println("특수문자 포함 안함:"+data);
		}
	}
}














