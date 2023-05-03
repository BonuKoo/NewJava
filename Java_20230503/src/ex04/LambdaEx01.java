package ex04;

interface MyFunction{
	int max (int a, int b);
}

//class MyMax implements MyFunction{
//
//	@Override
//	public int max(int a, int b) {
//		return a>b? a: b;
//	}
//	
//}

public class LambdaEx01 {

	public static void main(String[] args) {
////		MyFunction m = new MyFunction(); //인터페이스는 객체를 생성할 수 없다.
//		MyFunction m = new MyFunction() {	//익명 객체
//			
//			@Override						//안정성이 높아진다
//			public int max(int a, int b) {	//위에 Override가 붙어있으면
//				return a>b? a:b;					//인터페이스 쪽과 형태가 같아야'만' 한다.
//			}
//			
//		};				//익명 객체 : 1회용
//		
//		System.out.println("max : " +m.max(10, 20));
//	}
//}
		MyFunction m = new MyFunction() { // new 상태에서 컨트롤 스페이스 누르면 알아서 구현됨
			
			@Override
			public int max(int a, int b) {
				return 0;
			}
		};
			
		}
	}
