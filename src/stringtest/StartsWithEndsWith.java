package stringtest;

public class StartsWithEndsWith {
	public static void main(String[] args) {
		String data = "hello korea";
		boolean re = data.startsWith("hello");
		boolean re2 = data.startsWith("hi");		
		System.out.println(re);
		System.out.println(re2);
		System.out.println(data.endsWith("a"));
		
	}
}
