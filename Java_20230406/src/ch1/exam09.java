package ch1;

import java.util.Scanner;

//면접접수 >=70 , 실기 점수 >= 70 합격 , 아니면 불합격
public class exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    /////
		System.out.println("면접점수입력");
		int 면접점수 = sc.nextInt();
		System.out.println("실기점수입력");
		int 실기점수 = sc.nextInt();
		
		if(면접점수>=70) {
		    if(실기점수>=70) {
				System.out.println("합격");
		}else { 
		        System.out.println("불합격");}
		System.out.println("프로그램 종료");
		}
		    
	}
}

 // if(면접접수>= 70 && 실기점수 >= 70){
    //System.out.println("합격 입니다.");
    //}
    //else {
    	//System.out.println("불합격 입니다.");
        //System.out.println("내일부터 출근하세요."); 이 경우 중괄호를 한번에 묶어야 한다.
    //}
    //