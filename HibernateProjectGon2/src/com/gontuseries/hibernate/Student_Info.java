package com.gontuseries.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Identify which Table name going to create
@Entity
@Table(name = "STUDENT_INFORMATION")
public class Student_Info {
	// for table primary key
	@Id
	private int roll_no;
	private String name;

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
