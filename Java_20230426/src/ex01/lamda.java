package ex01;

public class lamda {

	public static void main(String[] args) {

		//익명
		//1 add
		Calculate cal = new Calculate() {
		@Override
		public int calculable(int x, int y) {
			return x+y;
			}
		};
		System.out.println(cal);
		
		//2 sub
		Calculate cal2 = new Calculate() {
		@Override
		public int calculable(int x, int y) {
			return x-y;
			}
		};
		System.out.println(cal2);
		
		//3 multi
		Calculate cal3 = new Calculate() {
			@Override
			public int calculable(int x, int y) {
			return x*y;
			}
		};
		System.out.println(cal3);
//		
//		//4 divide
		Calculate cal4 = new Calculate() {
			@Override
			public int calculable(int x, int y) {
			
			return x/y;
			}
		};
		System.out.println(cal4);
		
		//람다
		Calculate a = (x, y) -> (x+y);
		System.out.print(a.calculable(5, 3));
		
		Calculate b = (x,y) -> (x-y);
		System.out.print(b.calculable(5, 3));
	
		Calculate c = (x,y) -> (x*y);
		System.out.print(b.calculable(5, 3));
	
		Calculate d = (x,y) -> (x/y);
		System.out.print(b.calculable(6, 3));
	
		//익명구현 개체에선 메소드가 다수 있어도 괜찮다.
		Alc add = new Add();
		int result = add.calculate(10, 10);
		System.out.println(result);
		
		Alc sub = new Add();
		int result2 = add.calculate(10, 5);
		System.out.println(result2);
	
		Alc add1 = new Alc() {
			public int calculate(int x, int y) {
			return x+y;
			}
		};
		result = add1.calculate(10, 5);
		System.out.println(result);
	
		Alc mul = new Alc() {
			public int calculate(int x, int y) {
			return x*y;
			}
		};
		
		result = mul.calculate(2, 8);
		System.out.println("----람다식----");
		//람다는 하나만 존재해야 한다.
		
	Alc a = new Alc() {
	@Override
	public int calculate(int x, int y) {
		return x+y;
	}
	};
		
	System.out.println(a.calculate(3, 5));
	
	
	
	Alc sub1 = (x,y) -> x-y;
	result = sub1.calculate(5, 2);
	System.out.println(result);
	
	Alc div = (x,y) -> x/y;
	result = div.calculate(15, 3);
	System.out.println(result);
	
	
	}

}
