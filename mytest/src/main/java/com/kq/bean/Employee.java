package com.kq.bean;

import javax.validation.constraints.Size;

/**
 * Employee
 * @author kq
 * @date 2018-12-26
 */
public class Employee {

	private String id;

	@Size(max = 16,message = "名称")
	private String name;

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

	@Override
	public String toString() {
		return "Employee{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
