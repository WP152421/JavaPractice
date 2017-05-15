/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * dimigo.org.inheritance
 * 	 |_ PersonTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 10.
 * </pre>
 * 
 * @author leeyj
 * @version : 1.0
 */
public class PersonTest2 {

	public static void main(String[] args) {

		Person[] person = { new Person("Tom"), new Korean("홍길동"), new Japanese("다나카"), new Chinese("왕밍") };

		for (Person persons : person) {
			greeting(persons);
		}

	}

	private static void greeting(Person p) {
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		System.out.println();
	}
}
