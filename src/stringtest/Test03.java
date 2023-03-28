package stringtest;

public class Test03 {
	public static void main(String[] args) {
		String []data = {"kim","tiger","hong","Tiger",
				" tiger","lee","TIGER  "};
		
		int cnt = 0;
		for(int i=0 ; i<data.length ; i++) {
			String temp = data[i].toLowerCase();
			temp = temp.trim();
			if(temp.equals("tiger")) {
				cnt++;
			}
		}
		System.out.println(cnt);
		System.out.println("----------------------------");
		for(int i=0; i<data.length; i++) {
			System.out.println("|"+data[i]+"|");
		}
		
		
		
		
		// 배열안에 tiger는 모두 몇명있는지 파악하는 
		// 프로그램을 작성 해 봅니다.
		// 대소문자 구별없이 Tiger를 판별하도록 하고
		// 데이터앞에 공백도 제거하여 판별하도록 합니다.
		
	}
}
