/*
	입력한 문장에 "hello"를 포함하고 있는지 
	판별하도록 합니다.
 */
package stringtest;

import java.util.Scanner;

public class IndexOfTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.print("문장을 입력하세요==>");
		data = sc.nextLine();
		System.out.println(data);
		if(data.indexOf("hello") != -1) {
			System.out.println("hello를 포함");
		}else {
			System.out.println("hello를 포함 안함");
		}
	}
}











