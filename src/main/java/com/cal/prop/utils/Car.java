package com.cal.prop.utils;

/**
 * @author Murat �elik 16:43:08 19 Nis 2021
 *
 */
public class Car {

	public Car() {
		System.out.println("CALL CARSS");
	}

	private int id;
	private String title;
	private int price;
	private String img;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
