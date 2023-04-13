package ch4;

public class ex07 {
//1부터 45까지의 수 중에 랜덤하게 6개를 추출해라
	public static void main(String[] args) {
//			//1부터 45까지
		int[] lotto = new int[6];
		
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45);  //1부터 45까지
		for (int j=0; j<i; j++) {	
			if (lotto[i]==lotto[j]) { 
		break;		
	}
}
}
			
		for (int i=0; i<lotto.length; i++)     
			System.out.print(lotto[i] + ", ");	
			
		
	}

}

//		int[] lotto = new int[45]; 				//숫자 45개를 만듬
//
//		for(int i=0; i<lotto.length; i++)
//		lotto[i] = i+1;
//	
//	for(int i=0; i<lotto.length; i++) {
//		int num=(int)(Math.random()*45);
//		int tmp = lotto[i];
//		lotto[i] = lotto[num];
//		lotto[num] = tmp;
//	}
//			
//	System.out.println("이번주 로또 번호는 :");
//	for(int i=0; i<6; i++)
//		System.out.print(lotto[i]+", ");
//	
//	}
//	}