package practice;

import java.util.Scanner;

public class pr_8 {
 // 임의의 첫문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
	public static void main(String[] args) {
		//대문자가 나오면 true, 대문자를 입력해서 소문자가 나오면 false, 소문자를 입력해서 소문자가 나오면 true, 소문자를 입력해서 대문자가 나오면 false
		//'A' <= ch && ch <= 'Z' ; 
		//'a' <= ch && ch <= 'z' ;
//		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		
		char ch = str.charAt(0);
		//char ch2 = 'A'; //'a'
		System.out.println("첫 번째 문자 : " + ch); // 문자열 입력>> korea 하면 입력한 문자열 : korea 첫 번째 문자 : k
      //case1
		//if('a' <= ch && ch <='z')        //97 = 'a'   'z' = 122
		//	System.out.println("첫글자는 소문자이네.");
		//else if ('A' <= ch && ch <= 'Z')
		//	System.out.println("첫글자는 대문자이네.");
		//else
		//	System.out.println("영문자가 아님.");
	  
		//if	('A' <= ch && ch <= 'Z')                  // = true면  System.out.println("대문자입니다.");
		//else	('a' <= ch && ch <= 'z')                 // = false면 System.out.println("대문자입니다.");

		}
}
