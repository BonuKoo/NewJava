package ch4;

import java.util.Scanner;

public class ex01 {
/*
 * 조원 3명 자바점수를 입력받아서 출력하는 프로그램을 작성
 * 랜덤함수 이용해서 50~100사이 되도록 한다.값이 저장
 * 조원 3명의 자바점수를 입력받아서, 조원의 총점과 평균을 출력한다.
 	조원 3명의 각각 점수도 입력
 */
	public static void main(String[] args) {
		// 3명 저장공간 필요, 총점, 평균
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (int i=0; i<=2; i++) {					 			
		int score = (int)(Math.random()*50+1)+50; //3번 실행
		
			if (i==0) {
		a += score;		}
			
			else if (i==1) {									
		b += score;		}
			
			else  {
		c += score;		}
		
		}
		int sum = (a+b+c);
		 double aver = (double)sum/3 ;
		 System.out.println("내가 만든 쿠키" + a);
		 System.out.println("명선님" + b);
		 System.out.println("혜민님" + c);
		 
		 System.out.println("총점" + sum);
		 System.out.println("평균" + aver);
}
}

// int 구본우 ,추명선 ,정혜민;
//		구본우,추명선 ,정혜민 =0;
//double avg = 0;
               //51부터 100까지
//구본우 = (int)(Math.random()*50+1)+50;
//추명선 = (int)(Math.random()*50+1)+50;
//정혜민 = (int)(Math.random()*50+1)+50;
// sum = 구본우 + 추명선 + 정혜민
// avg = sum/3.0
//System.out.println( 구본우 + "," + 추명선 + "," + 정혜민);
//System.out.println( sum + "," + avg);