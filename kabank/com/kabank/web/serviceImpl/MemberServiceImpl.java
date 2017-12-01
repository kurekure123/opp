package com.kabank.web.serviceImpl;

import java.util.Calendar;

import com.kabank.web.bean.MemberBean;
import com.kabank.web.controller.Portal;
import com.kabank.web.service.MemberService;

public class MemberServiceImpl implements MemberService {

	private int count = 0;
	private MemberBean[] members;

	public MemberServiceImpl(int count) {
		members = new MemberBean[count];
		this.count = 0;
	}

	/*
	 * @ 뒤에 override는 뒤에 수식이 암호화
	 */

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount(int count) {
		return count;
	}

	public void addCustomer(MemberBean customer) {
		count++;
	}

	@Override
	public int createCustomNum() {
		int foo = 0;
		return foo;
		// algorithm AccountServiceImpl
	}

	@Override
	public String findGender(String ssn) {
		String foo = "";
		char ch = ssn.charAt(7);
		if (ch == '1' || ch == '3') {
			foo = "남";
		} else if (ch == '2' || ch == '4') {
			foo = "여";
		} else if (ch == '5' || ch == '6') {
			foo = "외국인";
		}
		return foo;
	}

	@Override
	public int findAge(String ssn) {
		Calendar cal = Calendar.getInstance();
		int year = 0, foo = 0, res = 0, c2 = 0;
		String year2 = "";
		year = cal.get(Calendar.YEAR);
		year2 = ssn.charAt(0) + "" + ssn.charAt(1);
		int now = cal.get(cal.YEAR);
		int year3 = Integer.parseInt(year2);
		int gap = now - year3;
		if (gap >= 2000) {
			res = Integer.parseInt("20" + year2);
		} else {
			res = Integer.parseInt("19" + year2);
		}
		foo = now - res;
		return foo;

	}

	@Override
	public void addcustomer(MemberBean customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addMember(MemberBean member) {
		members[count] = member;
		count++;

	}

	public MemberBean[] list(/* 파라 미터 */) {
		return members;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
