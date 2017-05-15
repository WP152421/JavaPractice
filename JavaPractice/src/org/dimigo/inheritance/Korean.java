/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * dimigo.org.inheritance
 * 	 |_ Korean
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 * 
 * @author leeyj
 * @version : 1.0
 */
public class Korean extends Person {
	public Korean(String name) {
		super(name);
	}

	public void sayHello() {
		System.out.println("안녕하세요");
	}

	public void sayBye() {
		System.out.println("안녕히 계세요");
	}

	public String toString() {
		return "저는 " + getName() + " 입니다.";
	}
}
