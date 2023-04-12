package ex01;

		 import java.util.Scanner;
		 
		  public class Exam04 {
			  public static void main(String[] args) {
				   
				  Scanner sc = new Scanner(System.in);
				  System.out.println("계산할 초를 입력>>");
				  int num = sc.nextInt();
				 
				  int hours = num/3600;
				  int minutes = (num%3600)/60;
				  int seconds = num % 60;
				 
				  
				  System.out.println(hours+"시,"  + minutes + "분," + seconds +"초");
				  
				
										 
		 
		
	}

}
