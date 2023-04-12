package ch05;

public class ex00 {

	public static void main(String[] args) {
		int total = 0;
		for (int i =1; ; i++) {
			if(i%2==0)
				total +=i;
			else
				total -= i;
		}
	}

}

