package kr.tpc;
public class Dog extends Animal{
	// �̸�, ����, �� : ��������
	// ������(override)
	public void eat() {
		System.out.println("��ó���Դ�.");
	}
	public Dog() {
		super();// new Animal();
	}

}
