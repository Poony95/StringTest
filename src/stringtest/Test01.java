package stringtest;
/*
 	String은 원래 참조자료형 이라서 
 	new 연산자에 의해 객체를 생성하고 사용해야 하지만
 	기본자료형처럼 사용할 수도 있어요!
 */
public class Test01 {
	public static void main(String[] args) {
		String data = new String("hello korea");
		String data2 = "hello korea";
		System.out.println(data);
		System.out.println(data2);
	}
}
