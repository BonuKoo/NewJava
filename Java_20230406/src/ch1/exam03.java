package ch1;

import java.util.Scanner;

public class exam03 {
/*나의 이름, 주소 , 나이(만으로 입력)를 입력 받아서 출력하는 프로그램 작성.. (단 나이는 +1해서 출력) 
	*/
	public static void main(String[] args) {
    
		Scanner sn = new Scanner(System.in);
        
		//nextline, nextInt
		
		String name = sn.nextLine();
		String address = sn.nextLine();   //next Line 같은 경우, 문장 전체를 입력가능.
		double age = sn.nextInt();        //만약 int age가 맨 위에 있을 경우 버퍼 기능 때문에 오류가 발생
		                                  // 이 경우 int와 다음 string name 사이에
		                                  // sn.nextLine(); 를 하나 추가해서 입력버퍼에 남아있는 엔터를 제거 할 수 있다
		// 엔터를 제거하지 않으면 String name = sc.nextLine();이 문장에서 엔터를 문장으로 인식해서, 버퍼에 남아있는 엔터를 name 변수에 넣는다.
		// 결과적으로 name에는 값이 입력되지 않음. int age(나이) - > sn.nextline(버퍼 제거) -> string name(이름 -> string address(주소) 
		/// 나중에 If (age >2 ) 
		
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + (age+1));
	}

}
