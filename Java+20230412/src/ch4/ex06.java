package ch4;

import java.util.Scanner;

public class ex06 {
/*최대값, 최소값 10개 시도, 배열을 사용해서
 * 1. int 배열 10개 생성,
 * 2. 랜덤함수 이용해서 10개 초기화
 * 3. 최대값, 최소값 출력
 * 4. for문 if문 다 들어가라
 */
 
	public static void main(String[] args) {
		int [] num = new int[10];
		int max;
		int min;
		
		for (int i=0; i<num.length; i++)
			num[i] = (int)(Math.random()*100);
		
		for (int i=0; i<num.length; i++)     
			System.out.print(num[i] + ", ");	
			
		System.out.println("오름차순 정렬!!");
		
		for (int i=0; i<num.length; i++)      //오름차순 
			for(int j=i; j<num.length; j++) {
//				for(int j=0; j<num.length; j++) { //j가 0이면 아래 식의 부등호가 반대방향 i=j일 때에 비해 비효율적이다.
				if(num[i]>num[j]) {		 //num[i]<num[j]
					int tmp = num[i]; 
					num[i]  =num[j];
					num[j]  = tmp;
				}
			}
			for (int i=0; i<num.length; i++)
				System.out.print(num[i] + ", ");
		
	}
}