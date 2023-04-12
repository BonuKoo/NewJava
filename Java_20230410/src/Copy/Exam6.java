package Copy;

//1 + (-2) +3 + (-4) .. 식으로 더해 나갈 때, 몇까지 더해야 총합이 100이상 될까? 이때 i값과, 총합을 출력
public class Exam6 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i= 1 ;  ;i++ ) {            // sum >=500 인건 애초에, sum이 0이니까 조건부터 성립을 안한다.  
		
			if (i%2==0) //홀수
				sum += i;
				else
					sum -= i;
			
		} else break;
			
			System.out.println(sum);
}
}