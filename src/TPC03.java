import kr.blt.Book;
import kr.blt.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		// ���踦 �����϶�. PDT VS UDDT
		// ���� 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		int a;
		a=10;
		
		// å 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		Book b;
		b=new Book();
		b.title="�ڹ�";
		b.price=15000;
		b.company="�ǽ����۴�";
		b.page=700;
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.print(b.page);
	
		PersonVO p;
		p =new PersonVO();
		p.name = "���ǽ�";
		p.age = 40;
		p.weight = 78.4f;
		p.height = 180f;
		
		System.out.print(p.name+"\t");
		System.out.print(p.age+"\t");
		System.out.print(p.weight+"\t");
		System.out.print(p.height);

	}

}
