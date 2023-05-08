package ex04;

import java.util.Optional;

class CantInfo{
	private String phone;
	private String address;
	
	public CantInfo(String phone, String address) {
		this.phone = phone;
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
		
}
public class IfElseTest {

	public static void main(String[] args) {
	
		Optional<CantInfo> c1 = Optional.of(new CantInfo(null, null));
		String phone =c1.map(c->c.getPhone()).orElse("No Phone");
		String address =c1.map(c->c.getAddress()).orElse("No Address");
		// 
		
		System.out.println(phone);
		System.out.println(address);
		
		/*CantInfo c1 = new CantInfo(null, null);
		
		String phone;
		String address;
		if(c1.getPhone() != null)
			phone = c1.getPhone();
		else 
			phone = "No phone!!";
		
		if(c1.getAddress() !=null)
			address = c1.getAddress();
		else
			address ="No Dept";
		phone = c1.getPhone();
		address = c1.getAddress();
		
		
		System.out.println(phone);
		System.out.println(address);
		*/
	}
}