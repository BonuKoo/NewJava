package ch05;

public class ex03 {
//   *        i = j   i = 0	j=0   j<i+1 식 때문에 i는 1이 됨,-> i = 1, j=0 
//	 ** 	  j = i+1 i = 1 j=
//	 ***			  i = 2
//	 ****			  i = 3	
//	 *****			  i = 4
	// i는 열
	// j는 행
	public static void main(String[] args) {
	
		for(int i=0; i<5; i++) {		
		for(int j=0; j<i+1; j++)		//        1,2,3,4,5
			System.out.print("*");
		System.out.println("");
		}
	}

}

