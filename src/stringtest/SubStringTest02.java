package stringtest;

//주민번호로 부터 출생연도를 파악하여 출력
public class SubStringTest02 {
	public static void main(String[] args) {
		String jumin = "800101-1234567";
		String year = jumin.substring(0, 2);
		System.out.println(year);
		int yy = Integer.parseInt(year)+1900;
		System.out.println(yy);
	}
}

