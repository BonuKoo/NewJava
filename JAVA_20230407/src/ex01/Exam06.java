package ex01;

import java.util.Scanner;

public class Exam06 {
//swhitch
	
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("계절입력>");   
    String season = sc.nextLine();
    
    switch (season) { 
    
    case "spring" :
         System.out.println(season + "입니다.");    // tap키로 들여쓰기를 하면 문자열을 오른쪽으로 당겨 주변의 문장과 구분할 수 있다.
       break;
    
    case "summer" :
    	System.out.println(season + "입니다.");
        break;
    
    case "fall"  :
    	System.out.println(season + "입니다.");
    	break;
    
    case "winter" :
    	System.out.println(season + "입니다.");
    	break;
    
    default : 
    System.out.println("이상기후");

    System.out.println("시스템을 종료합니다.");
    }
	}
}