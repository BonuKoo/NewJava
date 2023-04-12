package Copy;

 //3이상 4462 이하에서 짝수인 정수의 합   - 해결 못함
public class Exam4 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i=1; i<=4462; i++) {
			if(i<=3 && i<=4462 && i%2==0)
			sum += i;
			System.out.println("합의 값" + sum);
		}
			
}
}
