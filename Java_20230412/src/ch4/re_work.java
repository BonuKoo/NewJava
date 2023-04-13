package ch4;

public class re_work {
// 1. 배열 10개 생성 후 랜덤으로 1~100 사이 값을 넣는다.
// 2. 배열 10개 총점과 평균을 구한다.
// 3. 배열 10개 최대값, 최소값을 구한다.
// 4. 배열 10개 오름차순 정렬을 한다.
	public static void main(String[] args) {
		
		int[]num = new int[10]; 
		for (int i = 0 ; i<=num.length ; i++) { 
		num[i] = (int)(Math.random()*100)+1;
//		for (int j=0; j<i; j++) 			   
//			if (num[i] == num[j]) {
//				break;
		}
		System.out.print(num[i]);
	}
}
		
//2.-------------------------------------------------		
//	int sum = 0;									//총점
//	double aver = 0;								//평균
//	
//	for(i=0; i<=num.length; i++) {  
//		sum += num[i];
//		aver = sum/num.length;
//		
//	}
//	System.out.println("총점:" + sum + "평균 :" + aver );
////2. 종료	 
////3.-------------------------------------------------	
//	int max ,min  ;//최대,최소값
//	max = min = num[0];
//	
//	for(i=0; i<num.length; i++) {
//		if (max<num[i])
//		max= num[i];					//최대
//	}
//	for(i=0; i<num.length; i++ ) {		//최소
//		if (min>num[i])
//		min=num[i];
//	}
//	System.out.println("최대값:"+ max + ", 최소값:"+ min);
////3.종료	
////4.------------------------------------------------	
//	int tmp = num[0];
//		for( i=0; i<=num.length; i++) { 	//오름차순
//	for (int j=0; j<i; j++) {
//		if (num[i]>num[j])
//			
//			tmp 	= num[i];
//			num[i]  = num[j];
//			num[j]  = tmp;	
	
//4.종료

