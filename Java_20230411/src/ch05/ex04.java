package ch05;

public class ex04 {
//      *  //공백 4개 + *1        //공백을 4개 입력하고 별을 1개 후 줄 바꿈
//	   **  //공백 3개 + *2개	      공백을 3개 입력하고 별을 2개 후 줄 바꿈
//	  ***  //공백 2개 + *3개		  공백을 2개 입력하고 별을 3개 후 줄 바꿈
//	 ****  //공백 1개 + *4개
//	*****  //공백 0개 + *5개
	// i는 열
	// j는 행
	
	public static void main(String[] args) {
	
		for(int i=0; i<5; i++) {	      //i가 0부터 시작해서 5보다 낮아질 때까지 반복한다.	
			for(int j=0; j< 4-i;  j++)	  // 
				
				System.out.print("S");    //j 0일 때 '공백'을 4번 출력하고, 1일 때 3번 출력한다 왜냐? 열이 바뀔 때마다 j 값이 하나씩 줄어드니까.	
			for(int k=0; k<i+1; k++)      //안녕? 나는 k야. k는 i가 0일 때도 일단 1을 추가해서, 별을 하나 입력 할 수 있어
			
			System.out.print("*");
			
		System.out.println("");
		}
	



for(int i=0; i<5; i++) {
	for(int j=0; j<5; j++) {
		if(j<4-i)                   //i가 0일 때, j<4-0 이니까 공백을 4번 출력
			System.out.print(" ");  //i가 1일 때, 
		else 
			System.out.print("+");
			}
		System.out.println();
}
}
}