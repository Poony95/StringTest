package stringtest;

import java.util.regex.Pattern;


public class Test {
	public static void main(String[] args) {
		 String pattern = "(.+[0-9].+)(.+[a-zA-Z].+)(.+[!@#$%^&*(),.].+)"; //숫자만
         String val = "aAB12!@56"; //대상문자열
         boolean regex = Pattern.matches(pattern, val);
         System.out.println(regex);
	}
}
