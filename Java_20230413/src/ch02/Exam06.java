package ch02;

public class Exam06 {

	public static void main(String[] args) {
		int[] n = new int[5];
		int [][] num = new int[4][3];
		
		for(int i = 0 ; i< num.length; i++)
			for (int j = 0 ; j<num[i].length; j++)
				num[i][j] = (int)(Math.random()*100)+1;
		
		for (int i =0; i<num.length; i++) {
			for (int j = 0; j<num[i].length; j++)
				System.out.print(num[i][j] + ", ");
			System.out.println();
		}
	}

}
