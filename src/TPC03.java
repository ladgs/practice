import kr.blt.Book;
import kr.blt.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		// 관계를 이해하라. PDT VS UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		int a;
		a=10;
		
		// 책 1권을 저장하기 위한 변수를 선언하시오.
		Book b;
		b=new Book();
		b.title="자바";
		b.price=15000;
		b.company="건식컴퍼니";
		b.page=700;
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.print(b.page);
	
		PersonVO p;
		p =new PersonVO();
		p.name = "문건식";
		p.age = 40;
		p.weight = 78.4f;
		p.height = 180f;
		
		System.out.print(p.name+"\t");
		System.out.print(p.age+"\t");
		System.out.print(p.weight+"\t");
		System.out.print(p.height);

	}

}
