package kr.tpc;
// 책(Object)->제목, 가격, 출판사, 페이지수...
public class BookVO {
	 public String title;
	 public int price;
	 public String company;
	 public int page;
	// 디폴트생성자메서드 (생략)
	 public BookVO() {
		 // 초기화 작업
		 this.title="자바";
		 this.price=14000;
		 this.company="이지스";
		 this.page=282;
				 
		 
	 }
	 // 생성자 메서드의 중복정의 (overloading)
	 public BookVO(String a,int b,String c,int d) {
		 this.title=a;
		 this.price=b;
		 this.company=c;
		 this.page=d;
	 }
	
	
	
}
