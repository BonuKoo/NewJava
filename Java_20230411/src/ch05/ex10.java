package ch05;

public class ex10 {

	public static void main(String[] args) {
	//break, continue
		
		int sum=0;
		int i=0;
		
		for( i=1; i<=10; i++) {
			
			 if (i%2 == 0) continue; //홀수
				System.out.println(i);
		}
		System.out.println("프로그램 종료");
	}

}
