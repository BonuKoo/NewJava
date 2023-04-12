package ex01;

import java.util.Scanner;

  // 3이상 4462 이하에서 짝수인 정수의 합
  
public class Exam04 {

	public static void main(String[] args) {
		
		
		int sum =0 ;
	
		
//		for (int i=4; i<=4462; i+=2) {
//			sum +=i;//'i를 계속 더 해라'
//		
		for(int i=1; i<5000; i++) {                  // i가 1와 5000인 사이에서 계속 반복해라
			if(3<=i && i<= 4462 && i%2==0)           // 만약 i가 3이상이고 4462 이하이고 i가 2의 배수라면)
				sum += i;							 // i를 계속 증가시켜라.
		}
			
		System.out.println(sum);                     // sum을 출력
	
	}
}
//틀린 식
//int sum=0;
//
//for (int i=1; i<=4462; i++) {
//	if(i<=3 && i<=4462 && i%2==0)
//	sum += i;
//	System.out.println("합의 값" + sum);