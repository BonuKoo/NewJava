package ch06;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개의 숫자를 받으시겠습니까?");   //몇 개의 숫자를 받을지 물어보는 코드
		int count=sc.nextInt(); 					  // 반복할 횟수를 받음
		
		int i; 							//입력한만큼 반복하게 만들어야 한다.
		int num;
		int sum = 0;
		boolean (i<=count) = true;
		boolean (i>count) = false;
										// count 수만큼 반복하게 만들어야한다.
		while(i<=count){         		// i만큼 반복
			System.out.println(">>");    // 합할 정수를 입력
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			 i++;
			 
			if (num%2==0) {             //만약 num이 짝수라면
			sum += num;   			    // sum에 num 값을 더한다.
			}else { System.out.println()
			
			}
											// count만큼 반복한 다음, count를 넘어서면 정수의 합을 출력한다.
			
		} 
		else  {
			System.out.println("프로그램을 종료합니다."); 	//i값이 count값 보다 커졌으니, 합을 출력하고 프로그램을 종료
			System.out.println("정수들의 합 : " + sum);  
		}
	}

}
