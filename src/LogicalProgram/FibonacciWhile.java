package LogicalProgram;

import java.util.Scanner;

public class FibonacciWhile {

	public static void main(String[] args) {
		System.out.println("please provide value");
		Scanner sc = new Scanner(System.in);
		
		int input=sc.nextInt();
		int previous=0,next=1,result=0;
		int i=0;
		while(i<input) {
			System.out.println(previous +" ");
			result=previous+next;
			previous=next;
			next=result;
			i++;
		}

	}

}
