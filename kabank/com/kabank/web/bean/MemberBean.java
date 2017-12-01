package com.kabank.web.bean;


public class MemberBean {
	private int customNum, age;
	private String name, gender, ssn;
	/*
	 * customNum 은 멤버 변수는 생성자 (construction) private int customNum = 0; 의 경우는 언젠간은
	 * 암적인 존재가 됨으로 주의; 책 148p 생성자는 real 과 virtual 에서 각각 한번 작동된다.
	 */
	/*
	 * this is constructor , 포탈에서 불러들일때, 다른것은 받아들이지 않고 this.customNum = 0; 의 값을 받는다.
	 */

	public void setCustomNum(int customNum) {
		this.customNum = customNum;
		/*
		 * this is constructor , 포탈에서 불러들일때, 다른것은 받아들이지 않고 this.customNum = 0; 의 값을 받는다.
		 * setter = setCustomNum(int customNum) 네이밍 규칙 첫글자는 소문자, 그 이후는 대문자.
		 */
		/*
		 * refactoring 이란 class (Main Method)의 구조를 바꿈 . 첫째 리팩토링은 겉으로 드러나는 (Main Method)
		 * 소프트웨어 기능에 영향을 주지 않는다.
		 */
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

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return this.gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
}