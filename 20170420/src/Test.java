
public class Test {

	
	public static void main(String[] args) {
		Car.make = "현대";
		Car.printDummy();
		Car myCar = new Car();
		myCar.setColor("빨강");
		myCar.setYear(2020);
		System.out.println(myCar);
		
		Car yourCar = new Car("파랑", 2100);
		System.out.println(yourCar);
		
		myCar.make = "현대";
		System.out.println(yourCar.make);
		//정적변수는 "클라스명.정적변수명"으로 주로 접근한다.
		System.out.println(Car.make);
		
		//정적 메소드 (static method)
		//객체를 생성하지 않고 호출할 수 있는 메소드
		System.out.println(Math.sqrt(2.0));
	}
}