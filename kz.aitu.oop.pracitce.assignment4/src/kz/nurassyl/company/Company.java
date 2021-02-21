package kz.nurassyl.company;

public class Company {
	private int id;
	private String name;
	private Project project;
	public Company(int id, String name, Project project) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotalPrice() {
		int price = 0;
		for(int i = 0; i < project.getEmployees().size(); i++) {
			price += project.getEmployees().get(i).getSalary();
		}
		price += project.getPrice();
		return price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", project=" + project.toString() + "]";
	}
	
}
