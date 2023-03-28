package stringtest;
/*
 	int length()
 	공백도 문자로 취급하기 때문에 글자 길이에 포함됩니다.
 */
public class StringLengthTest {
	public static void main(String[] args) {
		String data = new String("hello korea ");
		int n = data.length();
		System.out.println(n);
	}
}
