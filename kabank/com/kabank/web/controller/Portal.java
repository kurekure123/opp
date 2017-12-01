package com.kabank.web.controller;

import java.util.Scanner;

import com.kabank.web.bean.MemberBean;
import com.kabank.web.serviceImpl.AccountServiceImpl;
import com.kabank.web.serviceImpl.MemberServiceImpl;

public class Portal {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("회원수 입력");
	   MemberServiceImpl memberService = new MemberServiceImpl(scanner.nextInt());
	   MemberBean member = null;
	   while(true) {
		   System.out.println("[Menu] 0.종료  1. 회원가입  2. 계좌개설, "
		   		+ "3. 총 회원수, 4. 회원목록");
		   int flag = scanner.nextInt();
		   switch(flag) {
		   case 0 :
			   System.out.println("종료");
			   return;
		   case 1 :
			   member = new MemberBean();
			   System.out.println("이름");
			   member.setName(scanner.next());
			   System.out.println("주민번호");
			   member.setSsn(scanner.next());
			   member.setCustomNum(memberService.createCustomNum());
			   member.setGender(memberService.findGender(member.getSsn()));
			   member.setAge(memberService.findAge(member.getSsn()));
			   memberService.addMember(member);
			   // member 생성 -> memberbean
			   // member = instance
			   System.out.println( "" +
					   " [고객 번호] : " + member.getCustomNum()
					   + " [주민번호] : " + member.getSsn()
					   + " [이름] : " + member.getName() 
					   + " [성별] : " + member.getGender()
					   + " [나이] : " + member.getAge()
					   );
		   case 2 : 
			   AccountServiceImpl service = new AccountServiceImpl();
			   service.setAccount();
			   System.out.println("당신의 이름은 무엇입니까?");
			   String name = scanner.next();
			   System.out.println(name + " [계좌번호] : " 
			   + service.getAccount()
			   );
			   break;
			   
		   case 3 :
			   System.out.println("총 회원 수는" + memberService.count());
			   break;
		   case 4 :    
			   MemberBean[] members = memberService.list();
			   for(int i= 0; i <members.length; i++) {
				   System.out.println(members[i].getName());
			   }
			   break;
		   }
		   
	   }
   }
}
