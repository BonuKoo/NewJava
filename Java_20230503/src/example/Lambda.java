import ex03.MyFunction;
//인터페이스
MyFunction   
int max (int a, int b);



//구현 클래스
MyFunction m = new MyFunction() { // new 상태에서 컨트롤 스페이스 누르면 알아서 구현됨
	
	@Override
	public int max(int a, int b) {
		return a>b? a:b;
	}
};
//익명 객체
MyFunction m = new MyFunction() {	
	
	@Override						//안정성이 높아진다
	public int max(int a, int b) {	//위에 Override가 붙어있으면
		return a>b? a:b;					//인터페이스 쪽과 형태가 같아야'만' 한다.
	}
	
};		
//람다
MyFunction m = 

(a, b) ->{	
return a>b? a:b;
};

 