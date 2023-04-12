package ex01;

import java.util.Scanner;

//
//국어, 수학, 영어
//성적을 입력 받아서 학점 구하는 프로그램 작성
//90 이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F 
public class Exam02 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("성적입력 : ");
    int number = sc.nextInt();

    
    if(number>=90)                   // if(number>=90 && number <=100) 이 방법으로 코드를 짤 경우,  
 	   System.out.println("A학점");   // 아래 조건 number >=80에 >90을 달지 않으면, 정수 200을 입력했을 때 그냥 B학점이라고 출력이 나온다.<=100을 할 경우 아래 로직에도 꼭 조건을 달아줘야함.
    else if(number>=80)
 	   System.out.println("B학점");
    else if(number>=70)
 	   System.out.println("C학점");
    else if(number>=60)
    	System.out.println("D학점");
    else
    	System.out.println("F학점");
	}
}

// 과목 3개를 입력해서 평균을 구함.평균 90 = A학점, 평균 80 = B학점, 평균 70 = C학점. 평균 60 = D학점, 나머지는 F학점

// 평균 값은 double로 구하기
