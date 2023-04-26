package Ex08;

class Value{
	int value;
	String name;
	public Value(String name, int value) {
		this.name = name;
		this.value = value;
		
	}

	@Override
	public String toString() {
		return "[name : " + name + ", value : " + value + "]";
	}
	
@Override
public boolean equals(Object obj) {
//	if(this.Value == ((Value)obj.value )
//		return true;
//	else
//		return false;
	
	return this.value == ((Value)obj).value ? true : false;

	}
}

public class EqualsEx1 {

	public static void main(String[] args) {
		
		Value v1 = new Value("kim",10);
		Value v2 = new Value("park",10);
		
		System.out.println(v1 == v2); //정수나 ch, string 을 직접 비교하는건 그냥 가능
		System.out.println(v1.equals(v2));	//객체를 만들고, 그 값을 변경하면 오버라이딩을 통해 적절히 변환 후 비교해야함.
		System.out.println("------");
		System.out.println(v1.toString());
		System.out.println(v2);
	
	}

}
