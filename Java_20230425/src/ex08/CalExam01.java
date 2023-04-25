package ex08;

public class CalExam01 {

	public static void main(String[] args) {
		Calculable cal = new Calculable() { //암기의 영역
			@Override
			public void calculate(int x, int y) {
				System.out.println("x+y: " +(x+y) );
			}
		};
		cal.calculate(5, 2);
		
		cal = new Calculable() {

			@Override
			public void calculate(int x, int y) {
				System.out.println("x-y :" + (x-y));
			}
			
		};
		cal.calculate(5, 7);
		
		Calculable cal2 = new Sub();
		cal2.calculate(5,7);
		
		// -> 람다식
		cal = (int x, int y) -> {
				System.out.println("x-y: " +(x-y));
		};
		cal.calculate(15, 7);
		//람다 
		
		cal = (x,y) -> System.out.println("x-y: " +(x-y));
	
		cal.calculate(17, 7);
		
		cal = (x,y)->System.out.println("x x y = " +(x*y));
		cal.calculate(5, 5);
	}

}
