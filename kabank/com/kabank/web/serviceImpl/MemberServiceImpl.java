package com.kabank.web.serviceImpl;

import java.lang.reflect.Member;
import java.util.Calendar;
import java.util.Vector;

import com.kabank.web.bean.MemberBean;
import com.kabank.web.service.MemberService;

public class MemberServiceImpl implements MemberService {
	
	private Vector<MemberBean> members;
	/* private MemberBean[] members는 집합체 (집합의 덩어리)인데
	 * MemberBean 에 옮겨 놓게 된다면 집합 안에 집합체를 두는 격이다.
	 * */

	public MemberServiceImpl() {
		members = new Vector<MemberBean>(10,10);
	}

	/*
	 * @ 뒤에 override는 뒤에 수식이 암호화
	 */


	public void addCustomer(MemberBean customer) {
	}

	@Override
	public int createCustomNum() {
		int num = 0;
		return num;
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
		members.add(member);
	//	members[count] = member;
		/* members 라는 집합의 [] 번째 객체는 = 객체 
		 * */

	}
	@Override
	public Vector<MemberBean> list() {
		return members;
	}

	@Override
	public int count() {
		
		return members.size();
	}

	@Override
	public void deleteAll() {
		members.clear();
	}

	@Override
	public void delete(String id) {
		int j = members.size();
		for(int i = 0; i < members.size(); i++) {
			if(id.equals(members.get(i).getId())) {
			}
		}
	}
	@Override
	public String login(MemberBean member) {
		String message = "아이디가 존재하지 않습니다";
		for(int i = 0; i < members.size(); i++) {
			/*  if(member.getId().equals(members.get(i).getId())){
			 *   (member.getPw().equals(members.get(i).getPw())) ? "비밀번호가 틀립니다" : "존재하지 않는 아이디 입니다" ;
			 *    }
			 **/
			 if(member.getId().equals(members.get(i).getId())) {
				if(member.getPw().equals(members.get(i).getPw())) {
					message = "로그인 되었습니다";
				}else if( !member.getPw().equals(members.get(i).getPw())) {
					message = "비번이 틀렸습니다";
					return message;
				}
			} 
		
		}
		return message;

	}
	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for(int i = 0; i < members.size(); i++) {
			if(id.equals(members.get(i).getId())) {
				member = members.get(i);
			}
		}
		return member;
	}
	
	@Override
	public Vector<MemberBean> findByName(String name) {
		Vector<MemberBean> temp = new Vector<>();
		int count = 0;
			for(int i = 0; i < members.size(); i++) {
				if(name.equals(members.get(i).getName())) {
					
				}
			}
		return temp;
	}

	
	

}
