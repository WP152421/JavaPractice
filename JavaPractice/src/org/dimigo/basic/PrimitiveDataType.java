/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	 |_ PrimitiveDataType
 * 
 * 1. 개요 : 아이유 프로필 출력하기
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 * 
 * @author leeyj
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age = 18;
		String name = "아이유";
		boolean isMale = false;
		double height = 161.8;
		float weight = 44.3f;
		char bloodtype = 'A';
		
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : "+ name);
		
		if (isMale == false) {
			System.out.println("성별 : 여자");
		}
	
		System.out.println("키 : "+ height+"cm");
		System.out.println("몸무게 : "+ weight+"kg");
		System.out.printf("몸무게 : %.1fkg\n", weight);
		System.out.println("혈액형 : "+ bloodtype +"형");
	}

}
