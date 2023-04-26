package ex01;
//인터페이스 하나 만들기
//사칙연산 .... + - * /
//익명객체 ... 람다...

public interface Alc {
	int calculate(int x,int y);
}

class Add implements Alc{
	@Override
	public int calculate(int x, int y) {
		return x+y;
	}
}

class Sub implements Alc{
	@Override
	public int calculate(int x, int y) {
		return x-y;
	}
}
class Mul implements Alc{
	@Override
	public int calculate(int x, int y) {
		return x*y;
	}
}
class Div implements Alc{
	@Override
	public int calculate(int x, int y) {
		return x/y;
	}
}
//람다는 함수가 하나만 존재해야한다.