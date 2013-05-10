package com.java.exercise.test;

/**
 * Fib
 * Write a non recursive function that prints the 10 first numbers of the Fibonacci sequence
 * @author User 1
 *
 */
public class Fibonacci {

	public static void main(String args[ ]) {
		Scanner input=new Scanner(System.in);
		int i,a=1,b=1,c=0,t;
		System.out.println("Enter value of t:");
		t=input.nextInt();
		System.out.print(a);
		System.out.print(" "+b);
		for(i=0;i<t-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		System.out.println();
		System.out.print(t+"th value of the series is: "+c);
	}
}
