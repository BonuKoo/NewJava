package ex02;

import java.util.Scanner;

class BankApplication {
	String 계좌번호;			//계좌번호
	String 예금주;			//예금주
	int 	잔액;				//잔액

	String AcNo = sc.NextLine();
	String Name = sc.NextLine(); 
	Int money   = sc.nextInt(); 

	
	int count ;
	
	
	
	Account [] AccountArr = new Account [100]; //계좌 갯수
	for(int i = 0; i<AccountArr.length-1; i++) { //100개 설정
	}
	

	
	
	void app (int count) { //메인 시스템 가동
	
		switch (count)
	case 1 :
	  
			void create(String ???-???)  //계좌 생성
				 System.out.println("-------");
			
			 
			break;
			
	case 2 :
			 void list () { //계좌목록
			System.out.println(AccountArr[]) //이 객체배열 안에 있는 정보 출력
			 }
			break;
			
	case 3 :
			// sc3을 입력받으면 예금 실행
			 int input() { //예금
			System.out.println("예금")
			System.out.println("계좌번호 :" + AccountArr[]의 계좌번호)
			System.out.println("예금액:")
			입금 메서드 잔액 + 들어갈 돈 입력 변수 PLUS
		
			 }
			break;
			
	case 4 :
			
			 int output() {//출금			
			System.out.println("예금")
			System.out.println("계좌번호 :" + AccountArr[]의 계좌번호)
			System.out.println("예금액:")
			출금 메서드 잔액 - 나갈 돈 입력 변수 MINUS
			 }
			break;
			
	case 5 :
			System.out.println("시스템을 종료합니다.");
			break;
			
			default
			System.out.println("시스템 에러");
			
			
}

class Account extends BankApplication {
	
	
	public Account (String 계좌번호) {
	this.계좌번호 = 계좌번호;
	}
	
	public Account (String 예금주) {
	this.예금주 = 예금주;
	}
	
	public Account (int 잔액) {
	this.잔액 = 잔액;
	}
	
}

public class containts {

	public static void main(String[] args) {
		//계좌 실행문구
		System.out.println("번호를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt(); //첫 입력 (1~5까지 입력)
		
	//계좌의 갯수		 
		
	
		//i부터 100까지 Account 객체가 생긴다.
	 
//		String AcNo = sc.NextLine(); //(계좌번호)
//		String Name = sc.NextLine(); //계좌주 이름 ()
//		Int money = sc.nextInt(); 	 //금액
	}

}





// 어플 실행 시 1~5번 기입
// 1을 입력 시 /// ---계좌생성--- , "계좌번호 입력하세요" -> 계좌번호 입력
			 // 				"계좌주 입력하세요" -> 계좌주 입력
			//					"초기입금액" -> "입급 할 금액 입력
								//결과 : 계좌가 생성되었습니다 출력

// 2를 입력 시	// ----계좌목록----, 배열 0과 배열 1의 ' 계좌번호' '예금주' '금액' 을 출력
// 3을 입력 시 // ----예금----,   ' 계좌번호 ' 출력 후 , ' 계좌번호'를 입력하면, 예금 할 금액을 입력
// 4를 입력 시 // ----출금 ----, '계좌번호 '를 출력 후 , ' 계좌번호'를 sc로 입력하면 '출금' 출력 후 ' 출금 할 금액을 입력.  

}

Account [] AccountArr = new Account [100]; //계좌 갯수
for(int i = 0; i<AccountArr.length-1; i++) { //100개 설정
	i++ // 0번째에 저절로 111-111 홍길동
		// 1번째에 저절로 111-222 강자바
	
}
