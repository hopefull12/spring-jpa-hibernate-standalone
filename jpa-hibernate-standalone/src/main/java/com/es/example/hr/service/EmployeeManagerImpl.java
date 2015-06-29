package com.es.example.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.es.example.hr.dao.EmployeeDAO;
import com.es.example.hr.model.Country;
import com.es.example.hr.model.Department;
import com.es.example.hr.model.Employee;
import com.es.example.hr.model.Job;
import com.es.example.hr.model.JobHistory;
import com.es.example.hr.model.Location;
import com.es.example.hr.model.Region;

@Service
public class EmployeeManagerImpl implements EmployeeManager{
	
	@Autowired
	private EmployeeDAO empDAO;

	@Transactional
	public void insertEmployee(Employee emp) {
		empDAO.insertEmployee(emp);
		
	}

	public List<Employee> findAllEmployees() {
		return empDAO.findAllEmployees();		
	}
	
	public List<Job> findAllJobs() {
		return empDAO.findAllJobs();		
	}	
	
	public List<Department> findAllDepartments() {
		return empDAO.findAllDepartments();		
	}	
	
	public List<Region> findAllRegions() {
		return empDAO.findAllRegions();
	}
	
	public List<Country> findAllCountries() {
		return empDAO.findAllCountries();
	}	
	
	public List<Location> findAllLocations() {
		return empDAO.findAllLocations();
	}	
	
	public List<JobHistory> findAllJobHistory(){
		return empDAO.findAllJobHistory();
	}

}
