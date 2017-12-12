package com.kabank.web.controller;

import java.util.Scanner;
import java.util.Vector;

import javax.swing.JOptionPane;

import com.kabank.web.bean.MemberBean;
import com.kabank.web.serviceImpl.AccountServiceImpl;
import com.kabank.web.serviceImpl.MemberServiceImpl;

public class Portal {
   public static void main(String[] args) {
	   MemberServiceImpl memberService = new MemberServiceImpl();
	   MemberBean member = null;
	   while(true) {
		   switch(JOptionPane.showInputDialog("[Menu] 0.종료  1. 회원가입  2. 계좌개설, \n"
			   		+ "3. 총 회원수, 4. 회원목록 , 5. 로그인, \n"
			   		+ "6. 회원 검색, 7. 이름 검색 , 8. 비번 수정, 9. 회원 탈퇴  \n "
			   		+ "10. 회원전체삭제")) {
		   case "0" :
			   System.out.println("종료");
			   return;
		   case "1" :
			   String spec = JOptionPane.showInputDialog("이름/주민번호/Id/PW");
			   String[] dummy = {
					   "홍길동/800211-101564/hong/1",
					   "김유신/950525-101042/kim/1",
					   "김유신/900101-132185/kim/1",
					   "이이/760632-195475/lee/1",
					   "유관순/961217-201664/you/1",
					   "신사임당/950205-207564/shin/1",
			   };
			   // 입력시에 /을 같이 입력해야함.
			   for(int i = 0; i < dummy.length; i++) {
				   member = new MemberBean();
				   String[] arr = dummy[i].split("/");
				   member.setName(arr[0]);
				   member.setSsn(arr[1]);
				   member.setId(arr[2]);
				   member.setPw(arr[3]);
				   member.setCustomNum(memberService.createCustomNum());
				   member.setGender(memberService.findGender(member.getSsn()));
				   member.setAge(memberService.findAge(member.getSsn()));
				   memberService.addMember(member);
			   }
			   // member 생성 -> memberbean
			   // member = instance
			   /*  System.out.println( "" +
					   " [고객 번호] : " + member.getCustomNum()
					   + " [주민번호] : " + member.getSsn()
					   + " [이름] : " + member.getName() 
					   + " [성별] : " + member.getGender()
					   + " [나이] : " + member.getAge()
					   ); 
			    * */
			   break;
		   case "2" : 
			   member = new MemberBean();
			   AccountServiceImpl service = new AccountServiceImpl();
			   service.setAccount();
			   System.out.println( member.getName() + " [계좌번호] : " 
			   + service.getAccount()
			   );
			   break;
			   
		   case "3" :
			   System.out.println("총 회원 수는" + memberService.count()) ;
			   break;
		   case "4" :    
			   JOptionPane.showMessageDialog(null, memberService.list());
			   break;
		   case "5" : 
			   String[] arr = JOptionPane.showInputDialog("ID/비번 입력해주세요")
			   					.split("/");
			   member = new MemberBean();
			   member.setId(arr[0]);
			   member.setPw(arr[1]);
			   String loginOk = memberService.login(member);
			 // String s = JOptionPane.showInputDialog("ID 와  비번 입력해주세요");
			   // Shallow 카피 , 암시적 객체 생성으로 생성됨.
			   // String s2 = "hong"
			   // 뒤에 메소드를 붙일 수 있는것은 객체밖에 없다.
			   JOptionPane.showMessageDialog(null, loginOk);
			   break;
		   case "6" :
			   JOptionPane.showMessageDialog(null, memberService.findById(JOptionPane.showInputDialog("검색하실 아이디를 입력해주세요")));
			   
			   break;
		   case "7" :
			   JOptionPane.showMessageDialog(null, memberService.findByName(JOptionPane.showInputDialog("고객명을 입력해주세요")));
			   
			   break;
		   case "8" :
		   case "9" : 
			   memberService.deleteAll();
			   break;
		   }
		   
	   }
   }
}
