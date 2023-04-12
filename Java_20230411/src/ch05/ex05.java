package ch05;

public class ex05 {

	public static void main(String[] args) {
		int i = 0;
		int sum=0;
		//for(초기;검사;증가)
		while(i<10) {       //괄호 안에 i를 i++로 바꿀 수도 있긴 하다. 덜 직관적이긴 하지만..
			i++;
			sum += i;
			
		}
		System.out.println("sum="+sum);
		
		System.out.println("============");
		
		
		int k=2;
		int m=1;
		
		while(m<=9) {
			m=1;
			while(m<=9) {
				System.out.printf("%d x %d = %d\n",k,m,k*m);
				m++;
			}
			k++;
		}
		
	}

}
