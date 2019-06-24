package com.starter.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {

	@Id
	private String id;
	private String bCode;
	private String bAuth;
	private Double bCost;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getbCode() {
		return bCode;
	}
	public void setbCode(String bCode) {
		this.bCode = bCode;
	}
	public String getbAuth() {
		return bAuth;
	}
	public void setbAuth(String bAuth) {
		this.bAuth = bAuth;
	}
	public Double getbCost() {
		return bCost;
	}
	public void setbCost(Double bCost) {
		this.bCost = bCost;
	}
	public Book() {
		super();
	}
	public Book(String bCode, String bAuth, Double bCost) {
		super();
		this.bCode = bCode;
		this.bAuth = bAuth;
		this.bCost = bCost;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bCode=" + bCode + ", bAuth=" + bAuth + ", bCost=" + bCost + "]";
	}
	
	
}
