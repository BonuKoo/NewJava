package ex05;

public class ButtonExam {

	public static void main(String[] args) {
		Button btnOk = new Button();
		
		class OkListener implements Button.clickListener{
			//클릭리스너를 구현
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
				//on click을 정의
			}
			
		}
		
		btnOk.setClickListener(new OkListener());
		btnOk.click();
		//Oklistener
		Button btnCancel = new Button();
		class CancelListener implements Button.clickListener{

			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		
		btnCancel.setClickListener(new CancelListener());
		btnCancel.click();
		//Cancel
		
		Button doubleClick = new Button();
		class DoubleListener implements Button.clickListener{

			@Override
			public void onClick() {
				System.out.println("더블클릭했습니다.");
			}
			
		}
		doubleClick.setClickListener(new DoubleListener());
		doubleClick.click();
	}

}
