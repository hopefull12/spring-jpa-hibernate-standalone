package com.es.example.hr.service;

import java.util.List;

import com.es.example.hr.model.Country;
import com.es.example.hr.model.Department;
import com.es.example.hr.model.Employee;
import com.es.example.hr.model.Job;
import com.es.example.hr.model.JobHistory;
import com.es.example.hr.model.Location;
import com.es.example.hr.model.Region;

public interface EmployeeManager {

	void insertEmployee(Employee emp);

	List<Employee> findAllEmployees();	
	
	List<Job> findAllJobs();
	
	List<Department> findAllDepartments();
	
	List<Region> findAllRegions();
	
	List<Country> findAllCountries();
	
	List<Location> findAllLocations();
	
	List<JobHistory> findAllJobHistory();
	
}
