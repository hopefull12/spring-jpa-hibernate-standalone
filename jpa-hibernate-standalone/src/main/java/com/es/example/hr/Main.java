package com.es.example.hr;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.es.example.hr.model.Country;
import com.es.example.hr.model.Department;
import com.es.example.hr.model.Employee;
import com.es.example.hr.model.Job;
import com.es.example.hr.model.JobHistory;
import com.es.example.hr.model.Location;
import com.es.example.hr.model.Region;
import com.es.example.hr.service.EmployeeManager;

public class Main {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeManager empManager = (EmployeeManager) ctx.getBean("employeeManagerImpl");

		List<Employee> listEmp = empManager.findAllEmployees();
		System.out.println("Employee count: " + listEmp.size());	
		for(Employee e : listEmp){
			
			System.out.println(e.getJob().getId());
			if(e.getDepartment() != null){
				System.out.println(" Department Name: "+e.getDepartment().getName());
			}
			
			Set<JobHistory> historys = e.getJobHistory();
			for(JobHistory history : historys){
				System.out.println("Job start date: "+history.getStartDate());
			}
		}

		List<Job> listJobs = empManager.findAllJobs();
		System.out.println("Jobs count: " + listJobs.size());	
		
		List<Department> listDep = empManager.findAllDepartments();
		System.out.println("Department count: " + listDep.size());		
		
		for(Department dep : listDep){
			
			for(Employee emp : dep.getEmployees()){
				System.out.println("Employee: "+emp.getFirstName()+" belongs to Department: "+dep.getName());
			}
		}
		
		//Regions
		List<Region> listReg = empManager.findAllRegions();
		System.out.println("Region count: " + listReg.size());		
				
		//Countries
		List<Country> listCountries = empManager.findAllCountries();
		System.out.println("Country count: " + listCountries.size());
		
		//Locations
		List<Location> listLocations = empManager.findAllLocations();
		System.out.println("Locations count: " + listLocations.size());		
		
		//Job History
		List<JobHistory> listHistory = empManager.findAllJobHistory();
		System.out.println("JobHistory count: " + listHistory.size());		
		
	}
}
