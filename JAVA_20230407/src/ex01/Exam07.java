package ex01;
 //코딩도작
import java.util.Scanner;

public class Exam07 {
  // 정수 하나 입력받아서 1-4, 1학년, 2학년, 3학년, 4학년
	
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int grade = sc.nextInt();
    //char ch = 'A'
    //int one = 1 ;
    final int ONE = 1;
    //final int TWO = 2;
    
    switch (grade) {
    case ONE :
   
    	System.out.println(grade + "학년입니다.");
	break;
    case 2 :
    	   
    	System.out.println(grade + "학년입니다.");
	break;
    case 3 :
    	   
    	System.out.println(grade + "학년입니다.");
	break;
    case 4 :
    	   
    	System.out.println(grade + "학년입니다.");
	break;
    
	default :
		System.out.println("졸업 좀 하세요.");
    }
}
}