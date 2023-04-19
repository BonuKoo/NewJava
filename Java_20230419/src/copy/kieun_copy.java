package copy;

import java.util.Scanner;

class Account {
	String accNum; //계좌번호
	String accName; //계좌주
	int deposit; //입금액
}

class BankApplication{
	final int SIZE = 100;
	Account[] ac = new Account [SIZE];	//계좌수 배열 100개
}

public class kieun_copy {

	public static void main(String[] args) {
		//지역변수 초기화
		
	String n; 	//null값
	int count=0;
	String accNum="";
	BankApplication ba = new BankApplication();	//은행앱 호출 변수
	
	//객체배열 생성
	for (int i =0; i<ba.ac.length; i++)
	{ba.ac[i]=new Account();}
	
	do {
		
	System.out.println("-----------------------------------------");
	System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
	System.out.println("-----------------------------------------");
		System.out.println("선택>");
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextLine();
		
		switch (n) {
		
		case"1" :
			System.out.println("-----");
			System.out.println("계좌생성");
			System.out.println("-----");
			System.out.println("계좌번호: ");
			
			ba.ac[count].accNum=sc.nextLine();
			System.out.println("계좌주: ");
			ba.ac[count].accName=sc.nextLine();
			System.out.println("초기: ");
		}
	
	}
	}

}
