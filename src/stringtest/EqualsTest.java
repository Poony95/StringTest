/*
	boolean equals(Object )
	==>  문자열이 같으면 true 그렇지 않으면 false를 반환합니다.
	
	문자열 변수에 == 연산자는
	두개의 변수가 같은 객체를 참조하고 있는지 판별합니다.
	
	그래서 같은 문자열 데이터를 갖고 있는지 판별하려면
	equals메소드를 이용해야 합니다.
 */

package stringtest;
public class EqualsTest {
	public static void main(String[] args) {
		String data1 = new String("hello");
		String data2 = new String("hello");
		if(data1.equals(data2)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		
//		if(data1 == data2) {
//			System.out.println("같아요!");
//		}else {
//			System.out.println("달라요!");
//		}
	}
}
