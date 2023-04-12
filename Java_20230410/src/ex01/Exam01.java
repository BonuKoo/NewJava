package ex01;

//1부터 100까지 반복하면서 , 그 사이에 2와 3의 배수가 얼마나 있는 지 출력해보시오. 6의 배수
public class Exam01 {

	public static void main(String[] args) {

		
		for(int i =1; i<=100; i++) {        //수행문장이 2개 이상이면 중괄호가 필요 ( 1. int i=1 실행, 2.i<=100 실행, 3.total += i 실행, 4.i++실행)
			if (i % 2 == 0 && i % 3 == 0) {							   //for문의 경우, 만약 조건 자체가 거짓이면 처음부터 실행을 하지 않는다.
		System.out.println("2와 3의 배수 :" + i );}
		}
	}

}

// for(int i=1; i<=100; i++)
// if (i%2 ==0 && i%3 ==0);
// System.out.print(i + ", ");