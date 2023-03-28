/*
	split의 
	분리자로 "."(마침표)을 사용할 수 없어요.
	
	다른 글자로 변경한 후 분리할 수 있어요!
 */
package stringtest;

import java.util.Scanner;

public class ExtFromFname02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fname;
		System.out.print("파일이름 입력==>");
		fname = sc.next();
		fname = fname.replace(".", ",");
		String []arr = fname.split(",");
		System.out.println("확장자:"+arr[1]);
	}
}











