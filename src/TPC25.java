
import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
	public static void main(String[] args) {
		// eat()--재정의(override)---->eat()
		Animal ani=new Dog();
		ani.eat(); // eat{?}-->eat{개} (다형성이 보장이 o)
		ani.move();
		
		ani=new Cat();
		ani.eat(); // eat{?}-->eat{고}
		ani.move();
		((Cat)ani).night();
		

	}

}
