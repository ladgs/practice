package basic;

import java.util.Scanner;

public class B2884 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int h=sc.nextInt();
		int m=sc.nextInt();
		
		sc.close();
		
		if (m>=45) {
			m=m-45;
			
			System.out.println(h);
			System.out.println(m);										
		}
		else {
			m=m-45+60;
			
			if(h==0) {
				h=h-1+24;
			}else {
				h=h-1;
			}
			
			System.out.println(h);
			System.out.println(m);							
		}

	}

}
