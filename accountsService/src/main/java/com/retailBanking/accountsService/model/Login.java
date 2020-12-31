package com.retailBanking.accountsService.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {

	@Id
	@Column(name = "userId")
	private double userId;
	
	@Column(name = "userName")
	private String userName;
	
	@OneToMany(targetEntity = Account.class, mappedBy="userId", fetch=FetchType.LAZY )
	private List<Account> acc = new ArrayList<>();


    
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Login(double userId, String userName, List<Account> acc) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.acc = acc;
		
	}



	public double getUserId() {
		return userId;
	}



	public void setUserId(double userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public List<Account> getAcc() {
		return acc;
	}



	public void setAcc(List<Account> acc) {
		this.acc = acc;
	}



	



	
	
	
}
