import kr.poly.*;

public class TPC26 {

	public static void main(String[] args) {
		
		//RemoCon r=new Remocon();
		
		RemoCon r=new TV();
		r.chUp();
		r.chDown();
		r.internet();
		
		r=new Radio();
		r.chUp();
		r.chDown();
		r.internet();
		

	}

}
