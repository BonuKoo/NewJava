package ch4;

public class ex08 {
//1부터 45까지의 수 중에 랜덤하게 6개를 추출해라
	public static void main(String[] args) {
//			//1부터 45까지
		int[] lotto = new int[6];
		
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45);  //1부터 50까지
		for (int j=0; j<i; j++) {	
			if (lotto[i]==lotto[j]) { 
		break;		
	}
}
}
		//오름차순
		for(int i=0; i<lotto.length; i++) {
			for(int j = i +1; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
			
		
	}

}


