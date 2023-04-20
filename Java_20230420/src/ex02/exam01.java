package ex02;
//아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, (수퍼클래스)
//이 클래스를 상속받도록 코드를 변경하시오 끼요옷

class Unit{
	
	int x,y;  //현재 위치	
	void move(int x, int y) { /*지정된 위치로 이동*/ }
	void stop()				{ /*현재 위치 정지*/ }
	
}

class Marine extends Unit{ 
	void StimPack()      	{  }
	void move(int x, int y) {
		System.out.println("걸어서 이동");
	}
}

class Tank extends Unit{ 
	void changeMode()		{  }
	void move(int x, int y) {
		System.out.println("탱크로 이동");
	}
}

class Dropship extends Unit{ 
	void load()				{  }
	void unload()			{  }
	void move(int x, int y) {
		System.out.println("배로 이동");
	}
}

class wraith extends Unit{
	
	
}

public class exam01 {

	public static void main(String[] args) {
		
		
		Dropship dr = new Dropship();			//a란 마린 객체를 3,5로 이동
		move(dr);
		Marine mr = new Marine();
		move(mr);
		Tank ta = new Tank();
		move(ta);
	}	
	
	static void move(Unit u) { //Unit 클래스의 참조변수 u
		u.move(10, 10);		   // 모두 10,10 입력
		
		
	}
	
}

//볼 시뻘건 사춘기
