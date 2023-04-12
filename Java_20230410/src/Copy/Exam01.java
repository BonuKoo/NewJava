package Copy;

//1부터 100까지 반복하면서 , 그 사이에 2와 3의 배수가 얼마나 있는 지 출력해보시오. 6의 배수
public class Exam01 {

	public static void main(String[] args) {

		int i = 1;
		for (; i<=100; i++) {
		if	(i%2==0 && i%3==0)
			System.out.println("2와 3의 배수인 i 값" + i);
			
		}
	}	
}