package kr.or.dgit.mybatis_dev.dto;

import java.util.Date;

public class Student {
	private int studId;
	private String name;
	private String email;
	private PhoneNumber phone;
	private Date dob;
	private Address address;
	private Gender gender;
	
	

	public Student() {}
	
	public Student(int studId, String name, String email, PhoneNumber phone, Date dob, Address address, Gender gender) {
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.address = address;
		this.gender = gender;
	}
	
	public Student(int studId, String name, String email, PhoneNumber phone, Date dob, Address address) {
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.address = address;
	}
	
	public Student(int studId, String name, String email, PhoneNumber phone, Date dob) {
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}
	

	public Student( String name, String email, PhoneNumber phone, Date dob) {
		
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}

	public PhoneNumber getPhone() {
		return phone;
	}

	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
		
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return studId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studId != other.studId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Student [%s, %s, %s, %s, %s, %s, %s]", studId, name, email, phone, dob, address,gender);
	}
	
	
	
}
