package ch4;

import java.util.Scanner;

public class ex02 {
/*
 * 조원 3명 자바점수를 입력받아서 출력하는 프로그램을 작성
 * 랜덤함수 이용해서 50~100사이 값이 저장되도록 한다.
 * 조원 3명의 자바점수를 입력받아서, 조원의 총점과 평균을 출력한다.
 	조원 3명의 각각 점수도 입력
 */
	public static void main(String[] args) {
		// 3명 저장공간 필요, 총점, 평균
		
//
//		 int sum = 0 ;
//		double avg = 0;
//		int[] 조4 = new int[3];     //[]안의 값에 따라 바뀐다. [3]이면 3번 , [4]이면 4번
//									//배열
//               
//		for(int i=0; i<3; i++) {
//			조4[i] = (int)(Math.random()*50+1)+50; //51부터 100까지.
//		}
//		for (int i = 0; i<3; i++)
//			sum+= 조4[i];
//		avg = sum/3.0;
//				
//				for(int i = 0; i<3; i++)
//					System.out.println(조4[i]+",");
//				
//				System.out.println();
//				System.out.println(sum + "," + avg);				
//		
//		final int MAX = 10;
		 int sum = 0 , max ;
		double avg = 0;
		max = 10;
		
		int[] 조4 = new int[max];     //[]안의 값에 따라 바뀐다. [3]이면 3번 , [4]이면 4번
									//배열
              
		for(int i=0; i<max; i++) {
			조4[i] = (int)(Math.random()*50+1)+50; //51부터 100까지.
		}
		for (int i = 0; i<max; i++)
			sum+= 조4[i];
		avg = sum/3.0;
				
				for(int i = 0; i<3; i++)
					System.out.println(조4[i]+",");
				
				System.out.println();
				System.out.println(sum + "," + avg);				

	}
}

