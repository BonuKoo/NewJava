package ch05;

public class ex06 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("[%d,%d]", i,j, args);
			}
			System.out.println();
		}
	}

}
