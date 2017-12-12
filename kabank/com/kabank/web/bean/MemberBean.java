package com.kabank.web.bean;


public class MemberBean {
	private int customNum, age;
	private String name, gender, ssn, id, pw;
	/*
	 * customNum 은 멤버 변수는 생성자 (construction) private int customNum = 0; 의 경우는 언젠간은
	 * 암적인 존재가 됨으로 주의; 책 148p 생성자는 real 과 virtual 에서 각각 한번 작동된다.
	 */
	/*
	 * this is constructor , 포탈에서 불러들일때, 다른것은 받아들이지 않고 this.customNum = 0; 의 값을 받는다.
	 */
	public void setCustomNum(int customNum) {
		this.customNum = customNum;
	}
	public int getCustomNum() {
		return customNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "[고객번호 = " + customNum + ", 나이=" + age + ", 이름 = " + name + ", 성별 = " + gender
				+ ", 주민번호=" + ssn + ", 아이디=" + id + ", 비밀번호=" + pw + "] \n";
	}
	

}