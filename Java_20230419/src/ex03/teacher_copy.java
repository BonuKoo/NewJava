package ex03;

	import java.util.Scanner;

	class Account{
		String 계좌번호;			
		String 예금주;			
		int    예금액;				
		
		Account(String 계좌번호, String 예금주, int 예금액){
			this.계좌번호 = 계좌번호; this.예금주 = 예금주; this.예금액 = 예금액;
		}
		
		void 계좌목록() {
			System.out.println(계좌번호 + " " + 예금주 + " " + 예금액);
		}
		void 예금 (int bal) {					//예금 매서드
			예금액 += bal;
		}
		void 인출 (int bal) { 				//인출 매서드
			예금액 -= bal;
		}
	}

		public class teacher_copy {

		public static void main(String[] args) {
				
		Account[] ac = new Account[100];
		int count = 0;				//
		boolean flag = true;		//while문 계속 돌아가도록 
		String 계좌번호;		
		String 예금주;
		int 예금액;
	
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			System.out.println("-------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 |3. 예금 | 4.출금 | 5. 종료");
			System.out.println("-------------------");
			System.out.println("선택>");
		int num = Integer.parseInt(sc.nextLine()); //첫 입력 sc
		
		switch (num) {
		
		case 1 :
					 System.out.println("-------");
				 	 System.out.println("계좌생성");
				 	 System.out.println("-------");
				 	 System.out.println("계좌번호 : ");
				 	 계좌번호 = sc.nextLine();						//111-111
				 	 System.out.println("계좌주 : ");
				 	 예금주 = sc.nextLine();						//쿠
				 	 System.out.println("초기입금액 : ");
				 	 예금액 = Integer.parseInt(sc.nextLine());
				 	 ac[count] = new Account(계좌번호,예금주,예금액); //계좌순서
				 	 count++;									//하나 만들었으니까 count 1 늘어난다
				 	 System.out.println("계좌가 생성되었습니다.");
				 	 break;
				
		case 2 :	
					System.out.println("-------");
					System.out.println("계좌목록");
					System.out.println("-------");
					for(int i = 0; i<count; i++)		//0번째 계좌부터 ~ I 번까지
					ac[i].계좌목록();
					break;
				
		case 3 :
			System.out.println("-------");
			System.out.println("예금");
			System.out.println("-------");
			System.out.println("계좌번호");
			계좌번호 = sc.nextLine();					//만들어놨던 계좌번호를 입력하세요 EX) 111-111
			System.out.println("예금액 :");			// 다음에 입력할 문자열을 정수화
			예금액 = Integer.parseInt(sc.nextLine()); 
			for(int i=0; i<count; i++) {
				if(계좌번호.equals(ac[i].계좌번호))		//위에 입력한 계좌번호가 .. 만약 0번째랑 111-111이랑 같으면
					ac[i].예금(예금액);					//0번째 111-111 에 예금액이 들어간다
				 }									//예금 매서드
				break;
				
		case 4 :
			System.out.println("-------");
			System.out.println("출금");
			System.out.println("-------");
			System.out.println("계좌번호");
			계좌번호 = sc.nextLine();					//111-111 
			System.out.println("출금액 :");
			예금액 = Integer.parseInt(sc.nextLine());	
			for(int i=0; i<count; i++) {
				if(계좌번호.equals(ac[i].계좌번호))		//111-111이 0이랑 일치하면
					ac[i].인출(예금액);					//인출 매서드
				 }
				break;
				
		case 5 :
				flag=false;
				
		}
		}
	System.out.println("프로그램 종료");
 }
}
