package ch05;

import java.util.Scanner;
// int 타입의 변수 num이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를
//완성하라. 만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력이어야 한다.
//문자열로 변환하지 말고, 숫자로만 처리해야 한다.

public class ex08 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); 
//		int num=0,sum=0; // 각 자릿수를 더하는 것을 출력
//		num = sc.nextInt();
//		
//		while (num !=0) {
//			sum+=num%10;
//		System.out.println();
//		num/=10;		      // 첫 num 값을 10으로 나누고, 
//	}

		
//		System.out.println("각 자리수의 합:"+sum);
		int i = 123;
		int sum = 0;
		
		while (i >0) {
			sum+=i%10;
			
			i/=10;
		}
		System.out.println("sum =" + sum);
		
}
}

//num이 입력되고, 이걸 10으로 나누면 1의 자리 수만 남는다. 
//sum += num%10     //5
//num =  num/10;    //1234
//sum += num%10     //5 + 4
//num =  num/10;    //123
//sum += num%10     //5 + 4 + 3
//num =  num/10;    //12
//sum += num%10     //5 + 4 + 3 + 2
//num =  num/10;    //1
//반복 sum += num%10 // 실수가 아니라 종료
//num = num/10      //0 - 종료 