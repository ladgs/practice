package basic;

import java.util.Scanner;

public class B9498 {

	public static void main(String[] args) {
//		���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, 
//		������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
//		if(a>89) System.out.println("A");
//		else if(a>79&&a<90) System.out.println("B");
//		else if(a>69&&a<80) System.out.println("C");
//		else if(a>59&&a<70) System.out.println("D");
//		else System.out.println("F");
		
		sc.close();
		
		System.out.println((a>=90)?"A": (a>=80)?"B": (a>=70)?"C": (a>=60)?"D": "F" );

	}

}
