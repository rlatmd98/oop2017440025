
public class Test {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sing();

		
		dog aDog = new dog();
		aDog.sing();
		aDog.name = "tina";
		System.out.println(aDog.name);
		System.out.println(aDog.getClass());
	}

}
