
import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.eat();
		
		Cat c=new Cat();
		c.eat();
		c.night();			
		
		//Dog.class, Cat.class
		Animal ani=new Dog(); // upcasting(�ڵ�����ȯ)
		ani.eat();
		
		ani=new Cat();
		ani.eat();
		//ani.night();
		((Cat)ani).night(); // downcasting(��������ȯ)

	}

}
