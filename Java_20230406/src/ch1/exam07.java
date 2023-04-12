package ch1;

import java.util.Scanner;

// 성별, 나이 --> 성별 : 남, 나이 : 20 이상이면 군대 간다.. 아니면 안간다.
public class exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//나이, 성별 순서면 프로그램 자체가 끝나버림. why? 버퍼링 (=로딩과정)
		//컴퓨터의 입력과 출력 과정에는 차이가 있다. 본체는 성능이 좋음, but 다른 키보드 등은 컴퓨터 속도를 따라오지 못함.
		// ex)키보드 <-> 버퍼 <-> 주기억장치(cpu)
		
		
		//System.out.println("나이 입력>");
		//int age = sc.nextInt();
		                           // next int 이후 line을 입력하는 과정 사이에서 하드웨어 장치 버퍼에 스페이스를 입력했다는 '사실'이 남아있어서 오류가 생김.
		                           // 이를 방지하기 위해 nextline을 하나 써놔서 오류를 방지한다.
		//sc.nextLine(); //엔터 제거 기능
		//System.out.println("성별 입력.");
		//String gender = sc.nextLine();
		
		//System.out.println("성별");
		//String gen = sc.nextLine();
		
		//System.out.println("나이");
        //int age = sc.nextInt();
        //boolean man = true;
        //if (gen == man) {
        //	if (age>=20)
        //		System.out.println("당신은 징집대상입니다.");}
        //else {
        //	System.out.println("당신은 대상이 아닙니다."); }
        
		System.out.println("성별 입력.");
		String 성별 = sc.nextLine();
		sc.nextLine();
		System.out.println("나이 입력.");
		int 나이 = sc.nextInt();
		if(성별.equals("남")) { //성별 == "남" 인지가 안됨 // 문자열 비교는 == 아니고 , equals
			if(나이>=22)
				System.out.println("징집대상");
			else
				System.out.println("군대 안감");}
		}
        }
	     // 성별  : 남을 입력했고, 나이 : 25세로 입력함 - > 성별에 '주소값'이 들어감
         // if ( 성별 == "남")
         // 문자 비교는 항상 equals로 한다. 암기 
	