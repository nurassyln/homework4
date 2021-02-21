package kz.nurassyl.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import kz.nurassyl.company.employee.Employee;
import kz.nurassyl.data.interfaces.IDB;



public class GeneralController {
private final IDB db;
	
	public GeneralController(IDB db) {
        this.db = db;
    }
	public List<Employee> getAllEmployee() {
		
		 Connection con = null;
	        try {
	            con = db.getConnection();
	            String sql = "SELECT * FROM employee";
	            Statement st = con.createStatement();

	            ResultSet rs = st.executeQuery(sql);
	            List<Employee> employees = new LinkedList<>();
	            while (rs.next()) {
	            	Employee employee = new Employee(rs.getInt("id" )
	                		, rs.getString("name"), rs.getInt("salary"),
	                		rs.getString("position")
	                		);

	            	employees.add(employee);
	            }

	            return employees;
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                con.close();
	            } catch (SQLException throwables) {
	                throwables.printStackTrace();
	            }
	        }
	        return null;
	    }
}
