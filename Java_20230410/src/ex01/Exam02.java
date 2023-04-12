package ex01;

//1부터 100까지 홀수의 갯수
public class Exam02 {
// 홀수의 갯수 = i%2=1
	public static void main(String[] args) {
//
//		int count = 0 ;
//		for ( int i=1; i<=100; i++) { 
//			if(i%2 == 1) {
//				 count ++ ;             // i가 홀수면 count가 계속 증가
//			}		
//		} System.out.println(count);
//		
//	}
//
//}

 int count = 0 ;
 for ( int i=1; i<=100; i++) { 
	if(i%2 == 1) {
		 count ++ ;             // i가 홀수면 count가 계속 증가
	}
 System.out.println("1번째 -> 1~100번 사이 홀수는 "+count);   						// 수정 필요
   count = 0;
} for ( int i=1; i<=100; i= i+=2) { // i= i+2   i가 1,3,5,7,9로 증가
   count++;}
 System.out.println("2번째 -> 1~100번 사이 홀수는 "+count);                             ///수정 필요
 
}
}