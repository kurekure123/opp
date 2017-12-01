package com.kabank.web.serviceImpl;

import java.util.Random;

public class AccountServiceImpl {
	/* 이 간격 내에 디폴트 생성자가 있음  
	 public AccountService() <- default 생성자 (existing)
	 * */
	private String name; 
	private int account;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
   public void setAccount() {
	   /* int는 return type이다 
	    * */
	   int acc = 0;
	   boolean flag = true;
	   Random r= new Random();
	   while(flag) {
		   acc = r.nextInt(1000000);
		   if(acc >= 100000 ) {
			   account = acc;
			   flag = false;
		   }else {
			   flag = true;
		   }
	   }
   }
   public int getAccount() {
	   return this.account;
   }
}
