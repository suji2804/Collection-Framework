package com.scaleupindia.entity;

/**
 * @author abhishekvermaa10
 *
 */
public class Employee implements Comparable<Employee> {
	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Employee o) {
		return this.getId() - o.getId();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}