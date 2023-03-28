package stringtest;

/*
 	String trim()
 	==>문자열의 앞과 뒤에 있는 공백을 제거한 새로운 문자열을 
 		반환합니다.
 		
 		
 */
public class TrimTest {
	public static void main(String[] args) {
		String data = new String("   hello java   ");
			
		String data2 = data.trim();
		int n2 = data2.length();		
		
		System.out.println(n2);
		System.out.println("|"+data2+"|");
		System.out.println("----------------------");
		int n = data.length();	
		System.out.println(n);
		System.out.println("|"+data+"|");
		
	}
}











