package practice;

import java.util.Scanner;

public class pr_5 {
    //문제 4. 사용자로부터 세 개의 정수를 입력받아 ,그 수들의 최대값과 최소값, 합계와 평균을 구해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c , total ;
	    double ave ;
	    
	    System.out.println("a를 입력하세요");
	    a = sc.nextInt();
	    System.out.println("b를 입력하세요");
	    b = sc.nextInt();
	    System.out.println("c를 입력하세요");
	    c = sc.nextInt();
	    
	    total = (a+b+c);
	    System.out.println ("합계" + total);
	    ave = (double)((a+b+c)/3);
	    System.out.println("평균" + ave);
	    
	    if(a>b&&a>c) System.out.println("최대 값은" + a + "입니다."); 
	    else if(b>a&&b>c) System.out.println("최대 값은" + b + "입니다.");
	    else if(c>a&&c>b) System.out.println("최대 값은" + c + "입니다.");
	    
	    if(a<b&&a<c) System.out.println("최소 값은" + a + "입니다.");
	    else if(b<a&&b<c) System.out.println("최소 값은" + b + "입니다.");
	    else if(c<a&&c<b) System.out.println("최소 값은" + c + "입니다.");
	    
	}

}
