package ex02;

enum Animal{
	Dog, Cat
//	0   1   2   3
}

enum Person2{
	MAN, WOMAN
//	 0     1   
}
public class SimpleEnum {

	public static void main(String[] args) {
		who(Person2.MAN.ordinal());
	
	}

	public static void who (int p) {
		switch(p) {
		case 0 :
			System.out.println("남성");
			break;
		case 1 :
			System.out.println("여성");
			break;
		}
	
	}
} //안정성이 떨어지는 구조이므로 비추