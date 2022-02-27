package basic;

import java.util.Scanner;

public class B2480 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int o;
		
		sc.close();
		
		if(a==b&&b==c&&a==c) {
			o=10000+a*1000;
			
		}
		else if(a==b||a==c) {			
			o=1000+a*100;			
		}
		else if(b==c) {
			o=1000+b*100;
		}					
		else o=Math.max(a,Math.max(b, c)) *100; 
		
		System.out.println(o);

	}

}
