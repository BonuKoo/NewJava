package ch05;

public class ex09 {

	public static void main(String[] args) {
	//break, continue
		
		int sum=0;
		int i=0;
		
		while(true) {
			sum+=i;
			i++;
			
			System.out.println("Sum="+sum);
			
			if(sum>100000) break;
		}
	}

}
