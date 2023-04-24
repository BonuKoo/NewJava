package ch7;

class Product {
	int price ;			//제품의 가격
	int bonusPoint;		//제품구매 시 제공하는 보너스 점수
	
	Product (int price) {
	this.price = price;
	bonusPoint = (int)(price/10.0);
	
	
	}
	Product(){}
}

class Tv extends Product {
	Tv() {super(100);}
	public String toString() {return "Tv";}
}

class Computer extends Product {
	Computer() {super(200);}
	public String toString() {return "Computer";}
	}

class Audio extends Product {
	Audio () {super (50);}
	public String toString() {return "Audio";}
}

class Buyer { // 고객, 물건 구매자
	int money = 1000;   //보유 금액
	int bonusPoint = 0; //보너스 점수
	Product[] item = new Product[10]; //구입한 제품을 저장하기 위한 배열
	int i =0; // Product 배열에 사용될 카운터
	
	void buy (Product p) { //구매용 함수
		if (money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;			// 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가.
		System.out.println(i);
		item[i++] = p;				//제품을 Product[] item에 저장한다.
		System.out.println(p + "을/를 구입하셨습니다");
		System.out.println("잔액은" + money + "입니다.");
		
	}
	
	void summary() {  	//구매 물품 요약
		int sum = 0;	//가격 합계
		String itemList = "";	//구매 물품목록
	
	for(int i =0; i<item.length; i++) {
		if(item[i]==null) break;
		sum+= item[i].price;
		itemList += item[i] + ", ";
	}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	} 
}

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}

}
