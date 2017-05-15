/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ SmartPhoneTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 * 
 * @author leeyj
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] p = new SmartPhone[2];
		p[0] = new IPhone("iPhone7", "애플", 900000);
		p[1] = new Galaxy("갤럭시 S8", "삼성", 800000);
		
		for(SmartPhone smart : p){
			System.out.println(smart.toString());
			smart.turnOn();
			smart.pay();
			smart.useSpecialFunction(smart);
			smart.turnOff();
			System.out.println();
		}
	}
}
