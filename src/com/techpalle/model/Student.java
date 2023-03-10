package com.techpalle.model;
//sql table nam should match
public class Student 
{
	private int id;
	private String name;
	private String email;
	private String qual;
	private String password;
	private long mobile;
	
	public Student(String name, String email, String qual, String password, long mobile) 
	{
		//we dont want to assign id so crate one more con
		super();
		this.name = name;
		this.email = email;
		this.qual = qual;
		this.password = password;
		this.mobile = mobile;
	}

    //rhtclk source confield
	public Student(int id, String name, String email, String qual, String password, long mobile) 
	{
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.qual = qual;
		this.password = password;
		this.mobile = mobile;
	}
	
	//rhtclk source con get
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
	

}
