package ch06;

public class FlowEX30 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum>100)
				break;
			++i;
			sum+= i;   //i값을 계속 누적해서 더함;
		}
		System.out.println("i="+i);
		System.out.println("sum=" + sum);
		

	}

}
