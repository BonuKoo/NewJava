package ex03;

public class Exam01 {

	static void action(Robot r) {

		
		if(r instanceof DanceRobot)	{
		//r이 참조하고 있는 대상이 DanceRobot이면 true, 아니면 false
		DanceRobot d = (DanceRobot)r;	//
		d.dance();
	}
	else if(r instanceof SingRobot) {
		SingRobot s = (SingRobot)r;
		s.sing();
		
	}
	else if(r instanceof DrawRobot) {
		DrawRobot dr = (DrawRobot)r;
		dr.draw();
	}
	}
	
		//action 매서드를 작성하시오
		// 각 객체의 매서드를 호출한다
		// DanceRobot, dance() 인 경우를 호출하고
		// SingRobot, sing() 인 경우를 호출하고
		// DrawRobot, draw() 인 경우를 호출한다
		// 반환타입 없음;
		// 매개변수 인스턴스 또는 의 자손 인스턴스
	
		// 출력결과
		// 춤을 춥니다.	
		// 노래를 합니다.
		// 그림을 그립니다.
	
	
	public static void main(String[] args) {
		Robot[]arr = {new DanceRobot(), new SingRobot(),new DrawRobot()};
		for (int i=0; i<arr.length; i++)
			action(arr[i]);
		
		//Robot 객체 배열 [0]인 경우 dance, 배열[1]인 경우 sing, 배열[2]인 경우 Draw
		
		
		
	}

}

class Robot{
	
}

class DanceRobot extends Robot{ 		//i가 0일 때
	void dance() {
		System.out.println(" 춤춰요.");
	}
}

class SingRobot extends Robot{			//i가 1일 때
	void sing() {
		System.out.println(" 노래 불러요.");
	}
}


class DrawRobot extends Robot{			//i가 2일 때
	void draw() {
		System.out.println(" 그림을 그립니다.");
	}
}


//1.Dance와 Sing과 Draw를 Robot으로 데려온다
//2.Robot에서 Sing과 Draw과 Robot을 정의 //
//3.Robot의 액션 매서드에서
//Sing과 Draw와 Robot의 dance(0) sing(1) draw(2) 함수를 호출해서 순서대로 실행

//class DanceRobot extends Robot{
//void dance() {
//	System.out.println("춤을 춥니다.");
//	}
//void action () {
//	this.dance();
//	}
//	}