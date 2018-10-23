package com.ceramicasietecoyas.jhsinformaticsolutionsbackend.model;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int id;
	private String name;
	private String dept;
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}


	public Employee() {
		
	}
	
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ",name="+ name + ",dept="+dept +"]";
		
	}
	
}
