package ch05;

public class ex11 {

	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
			
				if(i==j) continue; // i와 j 값이 같으면 출력 하지 않는다

				System.out.println(i + "x" + j + "=" + i*j);
				
		}
		
	}

}
}