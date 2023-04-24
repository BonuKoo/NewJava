package ex05;

public class teacher_copy {

	public static void main(String[] args) {
		
		      
	Buyer b = new Buyer(); 
	b.buy(new Tv());
	b.buy(new Computer());
	b.buy(new Tv());
	b.buy(new Audio());
	b.buy(new Computer());
	b.buy(new Computer());
	b.buy(new Computer());
		      
	b.summary();
	}
	}

	class Buyer{ //바이어
	int money =500;
	Product[] cart = new Product[3];
	int i = 0;
	int tmp;
		   
		   
	void buy(Product p) {   
		      
	 if (money < p.price) {
	System.out.println("소지한 돈은" + money + "입니다." + (p.price-money) + "부족합니다.");
	return;
	}   
	money -=p.price;
	add(p); // 구입한 물건은 tv,audio, computer, 등
	}
	
	void add(Product p) {
	cart[i]=p;
	 i++;
	}
		      
		      
	 void summary() { //지출 요약
	System.out.print("구입한 물건 :");
	for(int i=0; i<cart.length; i++)
	    System.out.print(cart[i]+ ",");
	    System.out.println();
	    System.out.println("사용한 금액" + (1000-money));
	    System.out.println("남은 금액 :" + money);
	}
		      
	}				//바이어 끝
	
	class Product { //제품
	int price;
	Product(int price) {
	this.price = price;
	}
	}

	class Tv extends Product { //TV
	 Tv() { super(100); } //상위 product 클래스에 int값을 받을 수 있는 생성자를 올린다.
	public String toString() { return "Tv"; }
	}

	class Computer extends Product { //Computer
	 Computer() { super(200); }
	public String toString() { return "Computer"; }
	}
	
	class Audio extends Product { //Audio
	Audio() { super(50); }
	public String toString() { return "Audio"; }
	}
	
	//Product[] cart = new Product[3];
	//cart[0] = new Tv();
	//cart[1] = new Computer();
	//cart[2] = new Audio();
	//System.out.println(cart[0].toString());
	//System.out.println(cart[1].toString());
	//System.out.println(cart[2].toString());
	
	
	
	