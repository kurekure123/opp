package com.kabank.web.service;

import com.kabank.web.bean.MemberBean;

public interface MemberService {
	public int createCustomNum();
	public String findGender(String ssn);
	/* 블락 / 바디가 {} 없는 메소드를 추상메소드라 함
	 * */
	public void addMember(MemberBean member);
	public void addcustomer(MemberBean customer);
	public int findAge(String ssn);
	public int count();
	public MemberBean[] list(/*파라 미터*/);
	
}	
