package kr.tpc;
// å(Object)->����, ����, ���ǻ�, ��������...
public class BookVO {
	 public String title;
	 public int price;
	 public String company;
	 public int page;
	// ����Ʈ�����ڸ޼��� (����)
	 public BookVO() {
		 // �ʱ�ȭ �۾�
		 this.title="�ڹ�";
		 this.price=14000;
		 this.company="������";
		 this.page=282;
				 
		 
	 }
	 // ������ �޼����� �ߺ����� (overloading)
	 public BookVO(String a,int b,String c,int d) {
		 this.title=a;
		 this.price=b;
		 this.company=c;
		 this.page=d;
	 }
	
	
	
}
