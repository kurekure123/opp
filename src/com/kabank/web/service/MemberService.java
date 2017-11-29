package com.kabank.web.service;

import java.util.Scanner;

public class MemberService {
	private int customNum; 
	private String name;
	private String gender;
	private int age;
	private String ssn;
	
	/* customNum 은 멤버 변수는 생성자  (construction)
	 private int customNum = 0; 
	  의 경우는 언젠간은 암적인 존재가 됨으로  주의;
	  책 148p 생성자는 real 과 virtual 에서 각각 한번 작동된다.
	 * */
	public MemberService() {
		this.customNum = 0;
		this.name = "";
		this.age = 0;
		this.gender = "";
		this.ssn = "";
		/* this is constructor , 포탈에서 불러들일때, 
		 다른것은 받아들이지 않고 this.customNum = 0; 의 값을 받는다.
		 * */
	}
	public void setCustomNum() {
		this.customNum = 101;
		/* this is constructor , 포탈에서 불러들일때, 
		 다른것은 받아들이지 않고 this.customNum = 0; 의 값을 받는다.
		 setter = setCustomNum(int customNum)
		 네이밍 규칙 첫글자는 소문자, 그 이후는 대문자.
		 * */
	}
	public int getCustomNum() {
		return this.customNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
    }
	public void setGender() {
		this.gender = gender;
		char ch = ssn.charAt(7);
		if(ch == '1' || ch == '3') {
			gender = "남";
		}else if(ch == '2' || ch == '4'){
			gender = "여";	
		}else if(ch == '5' || ch == '6'){
			gender = "외국인";
		}
	}
	public String getGender() {
		return this.gender;
	}
	public void setAge() {
		this.age = 30;
	}
	public int getAge() {
		return this.age;
	}
}