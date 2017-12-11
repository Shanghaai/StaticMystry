package com.org.sahil.StaticConcepts;

public class PrivateVariable {
	
	private String name;
	private String email;
	
	PrivateVariable(String a,String b)
	{
		this.name  =a;
		this.email  =b;
		
	}
	
	
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
}
