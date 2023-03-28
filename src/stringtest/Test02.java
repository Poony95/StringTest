package stringtest;

/*
 	char charAt(인덱스)
 	==> 문자열데이터의 인덱스 자리에 있는 글자 하나를 반환합니다.
 		인덱스는 0부터 시작합니다
 		빈칸(공백)도 하나의 문자로 처리됩니다. 
 */
public class Test02 {
	public static void main(String[] args) {
		String data = new String("hello java");
//		char e = data.charAt(10);
//		System.out.println(e);
		
		char a =data.charAt(0);
		char b =data.charAt(4);
		char c =data.charAt(5);
		char d =data.charAt(6);
		System.out.println("|"+a+"|");//|h|
		System.out.println("|"+b+"|");//|o|
		System.out.println("|"+c+"|");//| |
		System.out.println("|"+d+"|");//|j|
	}
}

/*
  Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 10
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:1515)
	at day0327/exam01.Test02.main(Test02.java:12)
 */









