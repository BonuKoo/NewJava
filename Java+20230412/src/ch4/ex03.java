package ch4;

import java.util.Scanner;

public class ex03 {

 
	public static void main(String[] args) {
		
		int sum = 0;
		int[] num = new int[3];
		
		num[0] =10;
		num[1] =20;
		num[2] =30;
		//num = {20,30,40};은 허용하지 않는다.
		int[] arrNum = {10,20,30};  // = new int[] {10,20,30}
		
		for(int i=0; i<3; i++)
			sum+=arrNum[i];
					System.out.println(sum);
	}
}

