package kr.poly;
public interface RemoCon {	// 객체생성x; RemoCon=new Remocon(); --> x
	//final static(상수)를 사용가능
	public static final int MAXCH=100;	// RemoCon.MAXCH
	public final static int MINCH=1;	// RemoCon.MINCH
	
	public void chUp();
	public void chDown();
	public void internet();	
}
