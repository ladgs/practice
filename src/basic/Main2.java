package basic;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int inS = in.nextInt();
		int[] input = new int[inS];
			
		for(int i=0;i<inS;i++) {
			input[i]=in.nextInt();															
		}
		in.close();
		Arrays.sort(input);		
		
		System.out.println(input[0] + " " + input[inS-1]);
	}
}
