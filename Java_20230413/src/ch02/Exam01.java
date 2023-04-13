package ch02;

import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {
		int[] arrNum = {10,20,30,40,50};
		System.out.println(Arrays.toString(arrNum));
		
		int[] arrNum2 = new int[10];
		
		for(int i=0; i<arrNum.length; i++) //arrNum 내용을 arrNuM2로 복사
			arrNum2[i] = arrNum[1];
		
		System.out.println(Arrays.toString(arrNum2));
		
		
		int[] tmp = new int[10];
		
		//max=min=10			//10이 min이 되고, min이 max가 된다.
		
		tmp = arrNum; //arrNum주소값을 tmp에게 복사, 따라서 arrNum와 tmp는 같은 배열 공간을 참조한다
		System.out.println(Arrays.toString(tmp));
		
		arrNum[3]=100;				//기존40에 100값을 집어넣음
		System.out.println(Arrays.toString(arrNum));
		System.out.println(Arrays.toString(tmp));
		System.out.println("--------------------------------");
		
		int[] arr = {10,20,30,40,50};0
		int[] arr2 = new int[10];
		
		System.arraycopy(arr, 0 , arr2, 0, 5);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(arr2));
		
	}

}
