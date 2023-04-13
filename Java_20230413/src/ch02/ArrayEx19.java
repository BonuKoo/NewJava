package ch02;

public class ArrayEx19 {

	public static void main(String[] args) {
		int [][] num = new int [5][5];
		
		int count =1 ; // [][]의 값
		
		int row = 0, col = -1;					
		
		int size = 5;
		while (size>0) {
			
			for (int i =0; i<size; i++ ) {
				col++;
				arr[row][col] = count++;
			}
		}
		
		}

}
