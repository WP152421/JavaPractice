/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 * 	 |_ Loop
 * 
 * 1. 개요 : 초간단 게임 프로그램
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 * 
 * @author leeyj
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		int power = 100;
		
		do {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("<<게임 메뉴>>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("메뉴 입력 => ");
			choice = scanner.nextInt();
			
			String[] worker = {"마법사", "영주", "기사", "농민"};
			int num = new Random().nextInt(4);
					
			switch(choice) {
			case 1 : 
				power += 10;
				System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n", power);
				break;
			case 2 : 
				power -= 10;
				System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n", power);
				break;
			case 3 : 
				System.out.println(worker[num]);
				break;
			case 9 : 
				System.out.printf("이제 공부하세요!\n");
				break;
			}
		}while(choice != 9);
	}
}
