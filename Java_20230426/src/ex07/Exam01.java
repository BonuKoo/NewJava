package ex07;
//package 05와는 다르게 자동으로 파일 종료
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exam01 {

	public static void main(String[] args) throws IOException { 
	
		
		String filePath = "C:/data/sample.txt"; //읽어올파일 경로
		String filePath2 = "C:/data/data.txt"; //읽어올파일 경로
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		
		
		try {
			reader = new BufferedReader(new FileReader(filePath)); 
			writer = new BufferedWriter(new FileWriter(filePath2)); 
			String line = null;
			
			while( (line = reader.readLine()) != null) {
//				System.out.println(line);
				writer.write(line+"\r\n");
			}
				
			}catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			reader.close();
			writer.close();
		}
		}
}
//		String text = "";
//		String fileName = "C:/data/data.txt";
//		
//		try {
//		BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(fileName,true));
//		
//		//파일 안에 문자열 쓰기
//		bw.write(text);
//		bw.flush();
//		
//		// 객체 닫기
//		bw.close();
//		
//	} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
//pg436

//이 클래스의 경우, BubberedReader 자체가 AutoCloseable을 구현하는 중이다.
// 자세한 내용은 https://docs.oracle.com/javase/8/docs/api/를 참고
// google - java 8 document : Overview 검색