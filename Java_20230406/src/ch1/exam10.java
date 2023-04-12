package ch1;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {
		Scanner sc = new scanner(system.in);
		
		int a, b, c;
		int max, min;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a>b && a>c) {a = max
		}else (b>a){ b = max
		}else (c>a) {c = max
		}
		
		if (a<b && a<c) {a = min
		} else if (b<a && b<c) {b=min
		} else (c<a && c<b) c=min
		}		
}

	//if(num1>num2) && num1>num3) {
		//	max = num1;
		//} else {
			//if (num2>num3) max = num2;
			//else max = num3;}
			
			
			//최소값 구하기
			//if(num1>num2 && num2>num3) {
				//min = num3;
			//} else {
				//if(num2<num3) min = num2;
				//else min = num1;