package ex03;

public class Exam04 {//public클래스는 다른 패키지에서 소환 가능
	 private int num = 100; //다른 클래스에서 접근 불가능
	 private String name;
	
	 public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() { //get String 말고 getName만 된다.
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 						//셋터 겟터 만들기 귀찮으면 Source
							// -> Generate Setter&Getter를 통해 만들어줄 수 있다.
	
	  						//private 값인 num을
		   					//다른 클래스에서 불러오기 위해
						    //set, get를 설정한다.
	
	
	
}

class Study{ //public이 붙어있지 않은 디폴트 값은, 해당 패키지 내에서만 사용이 가능하다.
	int count = 0;
	
	
	
} //다른 패키지에서 불러오려면 public을 붙여야 한다.


//디폴트 = 해당 패키지 내 접근가능
//private = 해당 클래스 내 접근가능
//public = 다른 패키지에서도 가능 (해당 프로젝트 내에서 가능

//class 앞엔 public과 디폴트
//메서드나 변수 등 앞엔 public, protected, default, private등

//멤버변수, 매서드 앞엔 private : 같은 클래스내에서 접근
//				  default : 같은 패키지 접근
//				  protected : 같은 패키지 내 다른 패키지에서 상속받아 자손클래스에서 접근 가능
//		  		  public  : 다른 패키지에서도 접근

//class 앞엔 Public
//			default
				 