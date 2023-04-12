package practice;

import java.util.Scanner;

public class pr_1 {
    // 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램 작성 (90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 나머지는 F)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
 // 변수 3개를 지정하고 3개를 더한 값 총점, 평균의 변수를 또 지정. 그 후 if 혹은 switch 를 통해 A, B, C, D ,F를 구한다.
        
        System.out.println("국어점수를 입력하세요.");
        double kor = sc.nextDouble();
        System.out.println("수학점수를 입력하세요.");
        double math = sc.nextDouble();
        System.out.println("영어 점수를 입력하세요.");
        double eng = sc.nextDouble();
        
        double tot = (kor+math+eng);
        System.out.println("총점은" + tot +"입니다.");
       
        double aver = tot/3;
        System.out.println("평균은" + aver +"입니다.");
        
       int grade = (int)aver/10;
        
       switch (grade) {
       case 10 : case 9 :
    	   System.out.println("A학점입니다.");
    	   break;
       case 8 : 
    	   System.out.println("B학점입니다.");
    	   break;
       case 7 : 
    	   System.out.println("C학점입니다.");
    	   break;
       case 6 : 
    	   System.out.println("D학점입니다.");
    	   break;
    	default :
    		System.out.println("F학점입니다.");}
       // if (aver>=90) System.out.println("A학점입니다.");
       // else if (aver>=80) System.out.println("B학점입니다.");
       // else if (aver>=70) System.out.println("C학점입니다.");
       // else if (aver>=60) System.out.println("D학점입니다.");
       // 	else  System.out.println("F학점입니다.");
	}
}
