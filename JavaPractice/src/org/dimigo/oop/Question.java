/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Question
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author leeyj
 * @version : 1.0
 */
public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String answer[] = { "나", "너", "우리" };
		String question[] = { "가장 좋아하는 가수는? ", "가장 좋아하는 배우는? ", "가장 좋아하는 과목은? " };
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d. %s\n", i + 1, question[i]);
			String yours = scanner.nextLine();

			if (yours.equals(answer[i]) == true) {
				System.out.println("정답입니다!");
			} else
				System.out.println("틀렸습니다!");
		}

		StringBuilder sb = new StringBuilder(question[0]);
		StringBuilder sb1 = new StringBuilder(question[1]);
		StringBuilder sb2 = new StringBuilder(question[2]);
		
		sb.append(answer[0]).append("입니다.");
		sb1.append(answer[1]).append("입니다.");
		sb2.append(answer[2]).append("입니다.");
		
		System.out.println("<<결과 출력>>");
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb2);
	}

}
