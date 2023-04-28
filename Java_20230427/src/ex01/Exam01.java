package ex01;

class Card{
	void info( ) {
		System.out.println("card()");
	}
}

public class Exam01 {	

	public static void main(String[] args) throws ClassNotFoundException{
		Card card = new Card();
		card.info();
		
//		Class cObj = Card.class;
//		Class cobj = new Card().getClass();
//		Class cObj = Class.forName("ex01.card");
//		Object obj = Class.forName("ex01.card");
	
		String str = "kor"; //String str과 아래의 str은 서로 ' 다른 ' 값이다.
		System.out.println(str);
		
		str = "korea";		
		System.out.println(str);
	
		System.out.println(str.indexOf("p"));
	
		String msg = str.replace("kor", "eng");
		System.out.println(msg);
		
		String s = "Hello";
		String s1 = s.replace('e','C');
		System.out.println(s1);
		
		String study = "kor,eng,math"; 
		study.split(",");			// kor,eng,math에서 ,만 빼고 kor eng math를 각각 배열에 넣는다.
		String[] aaa = study.split(",");
			for(String a : aaa)
				System.out.println(a);
	
		String AB = "AABBAABB";
		String ab = AB.replaceFirst("BA","bb");
			System.out.println(ab);	
		
			
		String D = "WeAllLiars";
		int idx1 = D.lastIndexOf('L');
		System.out.println(idx1);
		
		String Ex = "Kanye";
		String ex = Ex.concat(" is Pig");
		System.out.println(ex);
		
		String P = new String ("Jay");
		String P2 = new String ("Jay");
		boolean b = (P==P2);
		System.out.println(b);
		boolean b2 = (P.equals(P2));
		System.out.println(b2);
		boolean b3 = (P.intern()==P2.intern());
		System.out.println(b3); 
		
		String h = "PigDogCatPigCatDog";
		
		String H = h.replaceAll("Cat", "Pig");
		System.out.println(H);
	}

}
