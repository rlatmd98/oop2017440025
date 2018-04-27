
public class usesomeclass {

	public static void main(String[] args) {
		int a = 10;// int형의 변수 a 생성 + 값 10을 a에 저장 a = 원시변수 str = 참조변수 
		// string 객체 생성 String = 클라스 이름
		String str;//클라스 스트링의 객체를 참조할 수 있는 참조변수(레퍼런스 변수) 생성
		str = new String("Hello darkness my old friend.");//객체생성
	
		
		//String 객체의 길이
		//메소드 호출 방법: 참조변수, 메소드()
		int len = str.length();
				
	System.out.println(" String length is " + len);
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println(" str1: " + str1);
	}
}
