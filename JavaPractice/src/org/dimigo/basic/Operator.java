/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	 |_ Operator
 * 
 * 1. 개요 : 디미베네 연간 인건비
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 * 
 * @author leeyj
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long monthcash = 1700000;
		int employee = 3;
		int market = 1500;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d", monthcash)+"원");
		System.out.println("점포 내 직원 수 : "+3+"명");
		System.out.println(String.format("점포 수 : %,d개\n", market));
		System.out.println(String.format("연간 인건비 : %,d원", monthcash * employee * market * 12));
	}
}
