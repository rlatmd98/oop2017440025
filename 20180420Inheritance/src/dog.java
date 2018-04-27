// Animal에 있는 모든 것들을 가지고 온다.
public class dog extends Animal {
	//method overriding
	@Override //어노테이션 Overriding 확실하게 해주기위해 재정의
	public void sing() {
		System.out.println("멍멍");
    }
}
