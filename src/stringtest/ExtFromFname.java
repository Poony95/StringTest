/*
	사용자 한테 파일명을 입력받아 
	확장자를 추출하여 출력하는 프로그램을 작성
 */
package stringtest;

import java.util.Scanner;

public class ExtFromFname {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fname;
		System.out.print("파일이름 입력==>");
		fname = sc.next();
		String ext = fname.substring( fname.indexOf(".") + 1 );
		System.out.println("확장자:"+ext);
		
		if(ext.equals("png") || ext.equals("gif") || ext.equals("jpg")) {
			System.out.println("이미지파일");
		}else {
			System.out.println("이미지파일 아님");
		}
	}
}











