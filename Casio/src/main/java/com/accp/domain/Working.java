package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Working {
	private String status;
	
	private String type;
	
	private String clname;
	
	private String carNumber;
	
	private String phone;
	
	private String number;
	
	private String genre;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date orderTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date overworkdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date nowworkDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")	
	private Date stockDater;
	
	private float price;
	
	private String name;
	
	private String getman;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getClname() {
		return clname;
	}

	public void setClname(String clname) {
		this.clname = clname;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getOverworkdate() {
		return overworkdate;
	}

	public void setOverworkdate(Date overworkdate) {
		this.overworkdate = overworkdate;
	}

	public Date getNowworkDate() {
		return nowworkDate;
	}

	public void setNowworkDate(Date nowworkDate) {
		this.nowworkDate = nowworkDate;
	}

	public Date getStockDater() {
		return stockDater;
	}

	public void setStockDater(Date stockDater) {
		this.stockDater = stockDater;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGetman() {
		return getman;
	}

	public void setGetman(String getman) {
		this.getman = getman;
	}
	
	
}
