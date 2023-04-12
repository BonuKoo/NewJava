package practice;

import java.util.Scanner;

public class pr_4 {
    // 문제 3. 1학년부터 4학년까지 중간고사 시험을 보았다. 4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격, 이를 판단하는 프로그램을 작성해보자. 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//1학년 2학년 3학년 4학년, 점수가 70점 이상이면 합격, else 불합격
	//자신의 학년을 입력하시오, 점수를 입력하시오
	
	int grade = sc.nextInt();
	int point = sc.nextInt();
	
	if (grade== 4 && point >=70) {
		
	System.out.println("4학년 당신은 합격입니다.");
	}else if (grade==4 && point<70) 
	System.out.println("4학년 당신은 불합격입니다.");
	
	if (grade<4 && point >=60) { System.out.println("저학년 당신은 합격입니다.");
	}
	else if System.out.println("저학년 당신은 불합격입니다.");
	
	}
}

//4학년 합격 grade==4 && middle>=70 4학년 합격
//그 외 합격 ufelse grade<4 && middle>=60  그 외학년 합격
//else if middle < 0 || middle > 100 : 0미만 100초과이면 경고문력 출력
//else 불합격