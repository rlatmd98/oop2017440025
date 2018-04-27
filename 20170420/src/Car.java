
public class Car {
	//fields
	//정적변수 (static variable): 모든 객체내에서 하나만 있는 변수
	public static String make;
	private String color;
	private int year;
	//constructor(생성자)
	//no return type, method name = class
	public Car() {//no argument constructor
	
	public Car(String color, int year) { // constructor overloading
		this();
		this.color = color; this.year = year;
	}
	public String toString() { 
		return("이 차의 제조사는 " + Car.make + "이고" + "이 차의 색은 " + this.color+ "이고," + this.year + "년형 입니다.");
	}
	//methods
	public static void printDummy( ) {
		System.out.println("hello dummy");
		//error: 정적 메소드 내부에서 instance 변수를 접근할 수 없다.
		System.out.println(this.color);//객체가 없어서 instance value가 컴파일안됨
	}
	public String getColor() {
	public void setColor(String color) { 
	public int getYear() {
	public void setYear(int year) { 
		
		

	
}
