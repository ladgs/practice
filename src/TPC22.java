import kr.tpc.*;

public class TPC22 {
	public static void main(String[] args) {
		
		
		
		//upcasting
		// Cat ani=new Cat();
		//Object ani=new Cat();
		Animal ani=new Cat();
		ani.eat(); // �����Ͻ���->Animal, �������->Cat
		
		//ani.night();
		//Cat c=(Cat)ani;
		//c.night();
		
		//(Cat)ani.night(); // .�� ������
		
		((Cat)ani).night();
		
		ani=new Dog();
		ani.eat();
		//������
		//����Ŭ������ ����Ŭ�������� ������ �޼����� ���δٸ��� ���۽�Ű�� ����
		
		Object o=new Dog(); //upcasting
		//o.eat();
		((Dog)o).eat();	//downcasting
	}

}
