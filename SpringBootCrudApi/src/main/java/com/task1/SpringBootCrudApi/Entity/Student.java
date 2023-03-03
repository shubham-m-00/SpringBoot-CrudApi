package com.task1.SpringBootCrudApi.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	private String id;
	private String name;
	private String email;
	
	public Student() {
		super();
	}
	public Student(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	
	
	
	

}
