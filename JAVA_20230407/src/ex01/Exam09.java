package ex01;

import java.util.Scanner;

public class Exam09 {
 //학점 구하기. switch문으로 변경
	public static void main(String[] args) {
    Scanner sc = new  Scanner(System.in);
    System.out.println("학점 입력");
    //
    int A = (int)((Math.random()*100+1));                // 90~100
    int B = (int)((Math.random()*100+1-10));             // 80~90
    int C = (int)((Math.random()*100+1-20));             // 70~80
    int D = (int)((Math.random()*100+1-30));             // 60~70
    
    
    int grade = sc.nextInt();
    
    switch (grade) {
    case A :
    System.out.println("A입니다.");
    		break;
    case B :
    System.out.println("B입니다.");
    		break;
    case C :
    System.out.println("C입니다.");
    		break;
    case D :
    System.out.println("D입니다.");
    		break;
    
    default :
    System.out.println("학사 경고입니다.");}
	}
	}
//    
//    int number = sc.nextInt();
//    switch(number/10) {
//    case 10:
//    case 9:
//    	System.out.println("A입니다.");
//		break;
//    case 8:
//    	System.out.println("입니다.");
//		break;
//    case 7:
//    	System.out.println("c입니다.");
//    	break;
//    case 6:
//    	System.out.println("d입니다.");
//        break;
//    	default :
//    		System.out.println("프로그램 종료");
//    }
		
	


