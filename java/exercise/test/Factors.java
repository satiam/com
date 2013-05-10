package com.java.exercise.test;

/**
 * StwAndo
 * @author User 1
 *
 */
public class Factors {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.print("Stw" + "\n");
			} else if (i % 5 == 0 && i % 3 != 0) {
				System.out.print("Ando" + "\n");
			}

			else if (i % 5 == 0 && i % 3 == 0) {
				System.out.print("StwAndo" + "\n");
			}

			else {
				System.out.print(i + "\n");
			}
		}

	}
}
