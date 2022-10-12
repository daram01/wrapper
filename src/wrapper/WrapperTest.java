package wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		// �⺻�� -> �⺻�� 
		// ������ -> ������ (���)
		// �⺻�� -> ������ (�Ұ���) �ε�,
		// �⺻�� -> �������� �����ϰ� ���ִ� ����  wrapper Ŭ�����̴�.
		
		//wrapper Class : �⺻���� ���������� ����ȯ(�ڽ�, ��ڽ� = ��Ī�ؼ� ����ڽ�)
		//�ڽ� : �⺻�� -> ������
		//��ڽ� : ������ -> �⺻�� 
		
		int i = 10;
		Integer intg = i; // �⺻���� ���������� �ٲٴ� ��. �ڽ� // (Integer)i; // new Integer(i);
		
		Integer intg2 = new Integer(10);
		int i2 = intg2; // �������� �⺻������ �ٲٴ� ��. ��ڽ�
		
		
		System.out.println(intg); //10
		System.out.println(i2); //10
		System.out.println(intg+i2); //20
		
		//Object obj = (Object)i; // ������Ʈ���� �ڽ��� ������.
		//int i3 = obj; // ��ڽ��� �Ұ��ϴ�.
		
		String str = "50";
		//���ڿ��� ���ڷ� �ٲٰ� ���� �� �� ������ ���� ����.
		int i4 = Integer.parseInt(str);
		System.out.println(i4); //50
		// a50�� �־��� ��, NumberFormatException ��� ������ �߻�.
		
	}

}
