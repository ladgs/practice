package kr.poly;
public interface RemoCon {	// ��ü����x; RemoCon=new Remocon(); --> x
	//final static(���)�� ��밡��
	public static final int MAXCH=100;	// RemoCon.MAXCH
	public final static int MINCH=1;	// RemoCon.MINCH
	
	public void chUp();
	public void chDown();
	public void internet();	
}
