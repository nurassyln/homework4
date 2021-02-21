package kz.nurassyl;

import java.util.List;

import kz.nurassyl.company.Company;
import kz.nurassyl.company.Project;
import kz.nurassyl.company.employee.Employee;
import kz.nurassyl.controllers.GeneralController;
import kz.nurassyl.data.PostgresDB;
import kz.nurassyl.data.interfaces.IDB;

public class Test {
	public static void main(String[] args) {
		IDB idb = new PostgresDB();
		GeneralController controller = new GeneralController(idb);
		List<Employee> employees = controller.getAllEmployee();
		Company company = new Company(1, "Google", new Project(1, "Smartphone", 1000, employees));
		System.out.println(company.getTotalPrice());
	}

}
