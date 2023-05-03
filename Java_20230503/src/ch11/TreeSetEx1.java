package ch11;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
	
	String from ="b";
	String to ="d";
	
	set.add("abc");		set.add("alien");	set.add("bat");
	set.add("car");		set.add("Car");		set.add("disc");
	set.add("dance");	set.add("dZZZZ");	set.add("dzzzz");
	set.add("elephant");set.add("dldvator");set.add("fan");
	set.add("flower");
	
	System.out.println(set);
	System.out.println("range search : from " + from + " to "+to );
	System.out.println("result1 : " + set.subSet(from, to) );
	System.out.println("result2 : " + set.subSet(from, to + "zzz") );
	
	
	}

}
//자동으로 정렬이 된다 ~