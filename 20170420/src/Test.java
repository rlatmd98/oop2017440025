
public class Test {

	
	public static void main(String[] args) {
		Car.make = "����";
		Car.printDummy();
		Car myCar = new Car();
		myCar.setColor("����");
		myCar.setYear(2020);
		System.out.println(myCar);
		
		Car yourCar = new Car("�Ķ�", 2100);
		System.out.println(yourCar);
		
		myCar.make = "����";
		System.out.println(yourCar.make);
		//���������� "Ŭ�󽺸�.����������"���� �ַ� �����Ѵ�.
		System.out.println(Car.make);
		
		//���� �޼ҵ� (static method)
		//��ü�� �������� �ʰ� ȣ���� �� �ִ� �޼ҵ�
		System.out.println(Math.sqrt(2.0));
	}
}