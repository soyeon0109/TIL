package io;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("정수 1 입력");
		int first = key.nextInt();
		System.out.println("정수 2 입력");
		int second = key.nextInt();
		System.out.println(first + second);
		key.nextLine(); //enter 값 받음
		
		System.out.println("한글 문자열 입력");
		String word = key.nextLine(); //공백 포함 한줄 
		System.out.println(word);
		
	}

}
