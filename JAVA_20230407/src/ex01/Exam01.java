package ex01;

import java.util.Scanner;

//성적을 입력 받아서 학점 구하는 프로그램 작성
//90 이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F 
public class Exam01 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 과목 개수에 따라
    System.out.println("성적입력 : ");
    int number = sc.nextInt();
}
}
// 나쁜 예시   
//    if(number>90)
//   	System.out.println("A학점");
//   else {
//   	if(number>80)
//   		System.out.println("B학점");
//   else {
//   	if(number>70)
//   		System.out.println("C학점");
//    else {
//   	if(number>60)
//   		System.out.println("D학점");    
//}
//}
//}