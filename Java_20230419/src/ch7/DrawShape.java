package ch7; //318page
class 
public class DrawShape {

	public static void main(String[] args) {
		Point[] p = { new Point (100, 100),
					  new Point (140, 50),
					  new Point (200, 100)
		};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150,150),50);
		
		t.draw();
		c.draw();
		}
	}
class Shape {
	String color = "black";
	void draw() {
		System.out.println("[color=%s]%n",color);
	}
}

class Point {
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	point()

