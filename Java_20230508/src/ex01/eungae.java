package ex01;

import java.util.ArrayList;
import java.util.List;

public class eungae {

	public static void main(String[] args) {

		int[] a = {5,10,73,2,-5,42};

		System.out.print("정렬 전 : ");
		for(int arr : a) System.out.print(arr + ",");

		reverse(a); //reverse 함수 만들고 코드 작성해주세요.

		System.out.print("정렬 후 : ");
		for(int arr : a) System.out.print(arr + ",");
	}
	
	static void reverse(int[] a) {
		
		int[]tmp = new int [a.length]; //tmp 배열 = a 길이만큼
		for (int i=0; i<a.length ; i++){
			tmp[i] = a[a.length-i];
			a[i] = tmp[i];
		}
	}

}

//stack 선입후출