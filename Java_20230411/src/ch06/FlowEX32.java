package ch06;

public class FlowEX32 {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if (i%3==0)				//i가 3의 배수면 출력하지 않는다.
				continue;
			System.out.println(i);
		}
		

	}

}
