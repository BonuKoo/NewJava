package ch05;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		int sum = 0;
		
		while(num !=0) {
			sum+= num%10;
			System.out.println("sum:" + sum + "num :" + num);
			
			num/=10;
			
		} System.out.println("총합 :" + sum);




//String str = "12345";                 //아스키 코드 이용
//int sum = 0;
//
//for(int i=0; i<str.length(); i++) { //str.length(); - str이 5개를 가지고 있어서 5
//	
//	char tmp = str.charAt(i);
//	int num = (tmp-'0');   //아스키 코드의 0은 48, 
//	sum += num;
//}
//System.out.println("sum="+sum);
}
}