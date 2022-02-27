package basic;

import java.util.Scanner;

public class B2525 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int h,m;
		
		
		sc.close();
		
		
		if (b+c<60) {
			h=a;
			m=b+c;
			System.out.println(h);
			System.out.println(m);						
		}
		else {
			h=(b+c)/60+a;
			if(h>23) {
				h=h-24;
			}			
			m=(b+c)%60;
			System.out.println(h);
			System.out.println(m);					
		}
	}
}
