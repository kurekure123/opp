package com.kabank.web.service;

import java.util.Vector;

import com.kabank.web.bean.MemberBean;

public interface MemberService {
	public int createCustomNum();
	public String findGender(String ssn);
	/* 블락 / 바디가 {} 없는 메소드를 추상메소드라 함
	 * */
	public void addMember(MemberBean member);
	public void addcustomer(MemberBean customer);
	public int findAge(String ssn);
	public Vector<MemberBean> list();
	public int count();
	public void deleteAll();
	public void delete(String id);
	public String login(MemberBean member);
	public Vector<MemberBean> findByName(String name);
	public MemberBean findById(String id);
}	
