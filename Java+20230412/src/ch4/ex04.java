package ch4;

import java.util.Scanner;

public class ex04 {
/*최대값, 최소값 10개 시도, 배열을 사용해서
 * 1. int 배열 10개 생성,
 * 2. 랜덤함수 이용해서 10개 초기화
 * 3. 최대값, 최소값 출력
 * 4. for문 if문 다 들어가라
 */
 
	public static void main(String[] args) {
		int[] num = new int[10];					//10개 배열 생성
		int max;				//최대값 변수
		int min;				//최소값 변수
		
		for(int i =0; i<num.length; i++) //변수 i 0으로 시작해서 9까지
		num[i]=(int)(Math.random()*100+1);
		
		for(int i=0; i<num.length; i++) 				//랜덤 변수 i가 0이라면 
			System.out.print(num[i] + ", ");
			System.out.println();
			
			max = min = num[0];
			
			for(int i=0; i<num.length; i++) {
				if(num[i] > max)
				max = num[i];
			}
			for(int i=0; i<num.length; i++) {
				if(num[i] < min)
				min = num[i];
			}
			
			System.out.println("max ="+max);
			System.out.println("min ="+min);
		
			
	}
}



//int [] arr = new int[10];   //배열 방 10개 생성
//int k;						// k 임의 지정
//k=(int)(Math.random()*10);	// k는 랜덤 함수
//k = arr.length;				//랜덤 함수는 배열 방에 저장된다.
//
//for (int i=0; i<10; i++);		//일단 for문
//
//// int[i]가 최대면 int[1]을 출력
//if (int[i]>=)
//}
//}