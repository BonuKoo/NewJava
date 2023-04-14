package ch02;

public class Exam07 {

	public static void main(String[] args) {
//		int[][] num = new int[5][5];
//	
//		int count = 1;
//		int row = 0;
//		int col =-1;
//		// count는 1씩 증가한다. 
//		// 열이 0일 때, 행이 1씩 늘어날 때마다 count 값이 1씩 증가
//	
//		for(int i=0; i<num.length;i++)
//			int 	
//			count++;
//		
//		System.out.println(num[row][col] + ", ");
//	
 int[][] number= new int[5][5];
 int count = 0;
 for(int i = 0; i<number.length; i++)		//i는 값만큼 늘어난다.
 for(int j = 0; j<number[i].length; j++)	//j i값만큼 i가 늘어날 때마다
		number[i][j] = ++count;				//(i,j) 가 늘어날 때마다 count 값을 1씩 더한다.
		
		for ( int i=0; i<number.length; i++) {	
			for(int j=0; j<number[i].length; j++)
				System.out.printf("%2d", number[i][j]);
			System.out.println();
		}
		
	}

	}


//number.length 값이 무엇인지 여쭤보자.