package ex01;

public class StringBufferEx2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append(23);
		sb.append('4').append(56);
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
		System.out.println("sb = " +sb);
		System.out.println("sb2 = " +sb2);
		System.out.println("sb3 = " +sb3);
		
		System.out.println("sb = " +sb.deleteCharAt(10));
		System.out.println("sb = " +sb.delete(3, 6));
		System.out.println("sb = " +sb.insert(3,"abc"));
		System.out.println("sb = " +sb.replace(6, sb.length(),"END" ));
		
		System.out.println("capacity = " +sb.capacity());
		System.out.println("length = " +sb.length());
		
		
		String s = "10";
		int num = Integer.parseInt(s);
		
		Object obj = Integer.parseInt(s); // obj는 참조변수 = '객체'를 집어넣어야 한다.  10이라는 정수를 원래는 넣을 수 없음
		Object obj2 = Integer.valueOf(s);
		
		int i = 5;
		
		Integer iObj = new Integer(7);
		
		int sum = i + iObj;
		
		
	}

}
