
public class usesomeclass {

	public static void main(String[] args) {
		int a = 10;// int���� ���� a ���� + �� 10�� a�� ���� a = ���ú��� str = �������� 
		// string ��ü ���� String = Ŭ�� �̸�
		String str;//Ŭ�� ��Ʈ���� ��ü�� ������ �� �ִ� ��������(���۷��� ����) ����
		str = new String("Hello darkness my old friend.");//��ü����
	
		
		//String ��ü�� ����
		//�޼ҵ� ȣ�� ���: ��������, �޼ҵ�()
		int len = str.length();
				
	System.out.println(" String length is " + len);
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println(" str1: " + str1);
	}
}
