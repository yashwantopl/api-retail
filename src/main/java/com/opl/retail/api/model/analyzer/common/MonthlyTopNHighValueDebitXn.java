package com.opl.retail.api.model.analyzer.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "MonthlyTopNHighValueDebitXn")
@XmlAccessorType(XmlAccessType.FIELD)
public class MonthlyTopNHighValueDebitXn {
	@XmlAttribute(name = "date")
	private String date;
	
	@XmlAttribute(name = "chqNo")
	private String chqNo;
	
	@XmlAttribute(name = "narration")
	private String narration;
	
	@XmlAttribute(name = "category")
	private String category;
	
	@XmlAttribute(name = "amount")
	private String amount;
	
	@XmlAttribute(name = "balance")
	private String balance;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getChqNo() {
		return chqNo;
	}

	public void setChqNo(String chqNo) {
		this.chqNo = chqNo;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	
	

}
