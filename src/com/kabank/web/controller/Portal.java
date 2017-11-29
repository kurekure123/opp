package com.kabank.web.controller;

import java.util.Scanner;

import com.kabank.web.service.AccountService;
import com.kabank.web.service.MemberService;

public class Portal {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   while(true) {
		   System.out.println("[Menu] 0.종료  1. 회원가입  2. 계좌개설");
		   int flag = scanner.nextInt();
		   switch(flag) {
		   case 0 :
			   System.out.println("종료");
			   return;
		   case 1 :
			   MemberService member = new MemberService();
			   System.out.println("이름");
			   member.setName(scanner.next());
			   System.out.println("주민번호");
			   member.setSsn(scanner.next());
			   member.setCustomNum();
			   member.setGender();
			   member.setAge();
			   // ....
			   System.out.println( "" +
					   " [고객 번호] : " + member.getCustomNum()
					   + " [주민번호] : " + member.getSsn()
					   + " [이름] : " + member.getName() 
					   + " [성별] : " + member.getGender()
					   + " [나이] : " + member.getAge()
					   );
		   case 2 : 
			   AccountService service = new AccountService();
			   service.setAccount();
			   System.out.println("당신의 이름은 무엇입니까?");
			   String name = scanner.next();
			   System.out.println(name + " [계좌번호] : " 
			   + service.getAccount()
			   );
			   break;
		   }
		   
	   }
   }
}
