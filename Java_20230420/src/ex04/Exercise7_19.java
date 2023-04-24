package ex04;

public class Exercise7_19 {

	
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

		class Buyer{
		   int money =1000;
		   Product[] cart = new Product[3];
		   int i = 0;
		   int tmp;
		   int sum=0;
		   
		   void buy(Product p) {   
		      
		      if (money < p.price) {
		       System.out.println("잔액이 부족합니다");
		       return;
		      
		      } else {
		      money -= p.price;
		      System.out.println(p + "물건을 구매하였습니다.");
		      sum+=p.price;
		      add(p);   
		      
		      }
		      }
		   
		   
		      void add(Product p) {

		       if(i>= cart.length) {                          // i 값이 장바구니의 크기보다 같거나 크면
		          Product[] tmp = new Product[cart.length*2];      // 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다
		          System.arraycopy(cart,0,tmp,0,cart.length );  //  기존의 장바구니의 내용을 새로운 배열에 복사 
		          
		          //for(int j=0; j<cart.length; j++)
		          //tmp[j] = cart[j];
		          cart = tmp; // 새로운 장바구니와 기존의 장바구니를 바꾼다
		          
		          }
		       cart[i] = p;
		          i++;
		          }
		          
		       
		   void summary() {

		      int count=0;
		      for(int i=0; i<cart.length; i++) {
		      System.out.print(cart[i]+",");
		      }
		      
		      System.out.println("");
		      System.out.println("사용한 금액은 : " + sum + "입니다.");
//		      money -= sum;
		      System.out.println("남은 금액 : "+ money);
		   }   
		}


		class Product {
		   int price;
		   
		   Product(int price) {
		      this.price = price;
		   }
		}

		class Tv extends Product {
		   Tv() { super(100); }
		   
		   public String toString() { return "Tv"; }
		   
		}

		class Computer extends Product {
		   Computer() { super(200); }
		   
		   public String toString() { return "Computer"; }
		   
		}
		class Audio extends Product {
		   Audio() { super(50); }
		   
		   public String toString() { return "Audio"; }
		   
		}
