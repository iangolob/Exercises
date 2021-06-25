package hr.fer.oop;

import java.util.Scanner;

public class z8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = new String();
		do {
			input = sc.nextLine();
		}while(!input.equalsIgnoreCase("quit"));
	}
}
