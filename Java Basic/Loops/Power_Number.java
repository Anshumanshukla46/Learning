package Loops;

import java.util.Scanner;

public class Power_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		int n=sc.nextInt();
		int res=1;
		
		for(int i=1;i<=n;i++)
		   res=res*x;
		System.out.println(res);

	}

}
