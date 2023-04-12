package ch06;

import java.util.Scanner;

public class FlowEX31 {

	public static void main(String[] args) {
		int menu = 0;
		int num =  0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
		}
		}
}
