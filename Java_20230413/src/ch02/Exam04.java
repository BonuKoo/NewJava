package ch02;

public class Exam04 {

	public static void main(String[] args) {
		int[] n = new int[5];
		
		int[][] num = new int[4][3];   //4행 3열
		
		num[2][1] = 100;
		
		int[][]num2 = {
				{1,2,3,4},			//4		num2[0]				
				{5,6,7,8,3},			//5개	num2[1]
				{9,10,11,12,2}		//6개	num2[2]
		};
		for (int i=0; i<3; i++) {
			for(int j=0; j<num2[i].length; j++) 
				System.out.print(num2[i][j]+", "); //i가 0일 때, i가 1일 때, i가 2일 때 돌아감
		System.out.println();
	}

}
}