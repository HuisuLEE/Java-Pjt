package chapter04;

// ĸ��ȭ : �ν��Ͻ� ������ private�� ���Ϳ� ���� �޼ҵ�� public����
public class GoodDog {

	private int size; // �ν��Ͻ� ������ private�� ������

	public int getSize() { // ���Ϳ� ���� �޼ҵ�� public����
		return size;
	}

	public void setSize(int s) {
		size = s;
	}

	void bark() {
		if (size > 60) {
			System.out.println("�п�");
		} else if (size > 14) {
			System.out.println("����");
		} else {
			System.out.println("�۸�");
		}
	}

}
