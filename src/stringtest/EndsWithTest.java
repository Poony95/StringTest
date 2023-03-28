package stringtest;

import java.util.Scanner;

/*
	사용자 한테 파일명(확장자포함)을 입력받아
	이미지파일인지 판별하는 프로그램을 작성합니다.
	(이미지파일의 확장자 : png, jpg, gif)
 */
public class EndsWithTest {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		String fname;
		System.out.print("파일명을 입력==>");
		fname = sc.next();
		if(fname.endsWith(".png") 
				|| fname.endsWith(".jpg")
				|| fname.endsWith(".gif")) {
			System.out.println("이미지 파일");
		}else {
			System.out.println("이미지 파일 아님");
		}
		
	}
}









