import kr.tpc.MemberVO;

public class TPC14 {
	public static void main(String[] args) {
		
		MemberVO m = new MemberVO();
//		
//		m.name="ȫ�浿";
//		m.age=50;
//		m.tel="010-1112-1111";
//		m.addr="�ϸ�";
//				
//		System.out.print(m.name+"\t");
//		System.out.print(m.age+"\t");
//		System.out.print(m.tel+"\t");
//		System.out.println(m.addr+"\t");
		
		m.setName("ȫ�浿");
		m.setAge(50);
		m.setTel("010-1112-1111");
		m.setAddr("�ϸ�");
		
		System.out.print(m.getName()+"\t");
		System.out.print(m.getAge()+"\t");
		System.out.print(m.getTel()+"\t");
		System.out.println(m.getAddr()+"\t");
		
	}

}
