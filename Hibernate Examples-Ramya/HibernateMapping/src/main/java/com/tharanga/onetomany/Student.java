package com.tharanga.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private int marks;
	
	@OneToMany(mappedBy="student")
	private List <Laptop> laptops = new ArrayList <Laptop>();

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptop(List<Laptop> laptops) {
		this.laptops = laptops;
	}
	

}
