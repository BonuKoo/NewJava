package ch02;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {
		
		String[] str = new String[3];
		str[0]= "kor";
		str[1]= "eng";
		str[2]= "math";
		
		String[] str2 = new String[] {"kor2", "eng2", "math2"}; 
		
		System.out.println(Arrays.toString(str));0
		System.out.println(Arrays.toString(str2)); 		//ctrl + , = 오류로 커서 옮김

		String msg = "korea";
		char ch = msg.charAt(0);
		msg.length();
						//start,   end-1
						//	1		4 = ore  (ore 
		String msg2 = msg.substring(0,3); // kor  	
		System.out.println(msg2);
		// int a, int b			a==b(기본자료형 비교)  a.equals(b) - 기본형 외 참조형
		msg.equals(msg2);
	
		char[] ch2 = msg.toCharArray(); 	//msg에 있는 korea를 문자 단위로 분해한다.
		System.out.println(Arrays.toString(ch2));
	}
}
		//90년생부터 99년생까지 //for문 09/ 99/ 99
		// 
