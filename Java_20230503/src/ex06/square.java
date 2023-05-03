package ex06;

interface Myfunction{
	int square(int x); 
}

//class Mylambda implements Myfunction{ //이게 구현식
// 
//	@Override
//	public int square(int x) {
//		
//		return x*x;
//	}
//	
//}

public class square {

	public static void main(String[] args) {
		Myfunction m = x -> x*x;
		
		MyFunction a = new Myfunction() {
			
			@Override
			public int square(int x) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
				
		
		System.out.println(m.square(30));
			
		
		
	}

}
