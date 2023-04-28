package ex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam01 {

	public static void main(String[] args) {
		String str = "12345678910";
										//숫자만 입력해
		Pattern p = Pattern.compile("^[0-9]*$"); //정규식
		Matcher m = p.matcher(str); // str이 정규 표현식과 일치하는지 판단.
		System.out.println(m.find());
		
		
		System.out.println("-----------------------");
		String str2 = "123ABC";			//6자 입력해, 단 숫자하고 영문자만 입력해
		Pattern p2 = Pattern.compile("^[0-9A-Z]{6}$");
		Matcher m2 = p2.matcher(str2);
		System.out.println(m2.find());
		
		System.out.println("-----------------------");
		String str3 = "aaaa3a@naver.com"; //aaaaa@naver.com
		Pattern p3 = Pattern.compile("[\\w]*@[\\w]*.com$");
		Matcher m3 = p3.matcher(str3);
		System.out.println(m3.find());
		
		System.out.println("-----------------------");
		String str4 = "c77"; //
		Pattern p4 = Pattern.compile("^[b|c].{2}$"); //^ 시작의 개념. [^b\c]의 경우엔 반대의 개념 b,c로 시작하지 않는 문자열을 의미함.
		Matcher m4 = p4.matcher(str4);
		System.out.println(m4.find());
		
		System.out.println("-----------------------");
		String str5 = "!325a871-@$%"; //
		Pattern p5 = Pattern.compile(""); //^ 시작의 개념. [^b\c]의 경우엔 반대의 개념 b,c로 시작하지 않는 문자열을 의미함.
		Matcher m5 = p5.matcher(str5);
		System.out.println(m5.find());
		
		
		
	}
}

//wrapper = 기본형을 객체로 바꾸는 클래스
//객체를 기본형으로 바꿀 땐 언박싱. 기본형을 객체로 만들 땐 박싱

