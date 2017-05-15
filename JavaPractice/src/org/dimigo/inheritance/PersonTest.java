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
public class PersonTest {

	public static void main(String[] args) {

		Person p = new Person("Tom");
		System.out.println(p.toString());

		Korean k = new Korean("홍길동");
		System.out.println(k.toString());

		Japanese j = new Japanese("다나카");
		System.out.println(k.toString());

		Chinese c = new Chinese("왕밍");
		System.out.println(c.toString());

		System.out.println();

		p.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();

		System.out.println();

		p.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();

		Person[] person = { new Korean("홍길동"), new Japanese("다나카"), new Chinese("왕밍") };
		
		for (Person persons : person) {
			greeting(persons);
		}

	}

	private static void greeting(Person p) {
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		
	}
}
