/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Car
 * 
 * 1. 개요 : 자동차 목록
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 * 
 * @author leeyj
 * @version : 1.0
 */
public class Car2 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getPrice() {
		return price;
	}

	public void setCompany(String newcompany) {
		company = newcompany;
	}

	public void setModel(String newmodel) {
		model = newmodel;
	}

	public void setColor(String newcolor) {
		color = newcolor;
	}

	public void setMaxSpeed(int newmaxSpeed) {
		maxSpeed = newmaxSpeed;
	}

	public void setPrice(int newprice) {
		price = newprice;
	}
	
	public Car2(String newcompany,String newmodel,String newcolor,int newmaxSpeed,int newprice){
		company = newcompany;
		model = newmodel;
		color = newcolor;
		maxSpeed = newmaxSpeed;
		price = newprice;
	}

}
