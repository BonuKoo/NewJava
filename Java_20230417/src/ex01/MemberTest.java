package ex01;
//login 메소드를 호출할 때에는 매개값으로 id와 password를 제공하고,
//log()메소드는 id만 매개값으로 제공하려고 합니다.
// memberService 클래스에서 log() logout() 메소드를 선언
class Member{
	String name;
	String id;
	String password;
	int age;
	
	//로그인 상태 = true, 로그인 되어 있지 않은 상태 == false
	boolean login (String id,String password) {
		if(id.equals(id)&&password.equals(password))
		// equals id, password
			return true;
		else return false;
	}
	
	void logout(String id) {
	// login이 true인 상태에서, equals id가 맞으면 false // false가 로그아웃상태	
		
//		if login(true) 
//		 if (id.equals(id)) = false;
		System.out.println(id + "님 로그아웃되었습니다.");
		
	}
}
public class MemberTest {
	
	//class MemberService{}
	public static void main(String[] args) {
		Member m = new Member();
		
		Boolean b = m.login("로아", "1234");
		if(b == true)
			System.out.println("로그인 성공");
		else System.out.println("로그인 실패");
		
		Boolean b2 = m.login("홍길동","12345");
		if(b2 == true)
			System.out.println("로그인 성공");
		else System.out.println("로그인 실패");
		
		m.logout("홍길동");
	}
	


}


