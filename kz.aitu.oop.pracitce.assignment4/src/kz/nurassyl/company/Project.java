package kz.nurassyl.company;

import java.util.ArrayList;
import java.util.List;

import kz.nurassyl.company.employee.Employee;

public class Project {
	private int id;
	private String name;
	private int price;
	List<Employee> employees = new ArrayList<Employee>();
	public Project(int id, String name, int price, List<Employee> employees) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.employees = employees;
	}
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", price=" + price + ", employees=" + employees + "]";
	}
	
	
}
