
public class Car {
	//fields
	//�������� (static variable): ��� ��ü������ �ϳ��� �ִ� ����
	public static String make;
	private String color;
	private int year;
	//constructor(������)
	//no return type, method name = class
	public Car() {//no argument constructor
	
	public Car(String color, int year) { // constructor overloading
		this();
		this.color = color; this.year = year;
	}
	public String toString() { 
		return("�� ���� ������� " + Car.make + "�̰�" + "�� ���� ���� " + this.color+ "�̰�," + this.year + "���� �Դϴ�.");
	}
	//methods
	public static void printDummy( ) {
		System.out.println("hello dummy");
		//error: ���� �޼ҵ� ���ο��� instance ������ ������ �� ����.
		System.out.println(this.color);//��ü�� ��� instance value�� �����Ͼȵ�
	}
	public String getColor() {
	public void setColor(String color) { 
	public int getYear() {
	public void setYear(int year) { 
		
		

	
}
