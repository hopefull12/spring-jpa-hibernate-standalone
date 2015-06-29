package com.es.example.hr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.es.example.hr.model.Country;
import com.es.example.hr.model.Department;
import com.es.example.hr.model.Employee;
import com.es.example.hr.model.Job;
import com.es.example.hr.model.JobHistory;
import com.es.example.hr.model.Location;
import com.es.example.hr.model.Region;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	@PersistenceContext
	private EntityManager entityManager;

	public void insertUser(Employee emp) {
		entityManager.persist(emp);
	}

	public void insertEmployee(Employee emp) {
		entityManager.persist(emp);
	}

	public List<Employee> findAllEmployees() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = builder.createQuery(Employee.class);
		Root<Employee> root = cq.from(Employee.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();
	}	
	
	public List<Job> findAllJobs(){		
		return entityManager.createQuery("select j from Job j").getResultList();
	}
	
	public List<Department> findAllDepartments(){
		return entityManager.createQuery("select d from Department d").getResultList();
	}	
	
	public List<Region> findAllRegions() {
		return entityManager.createQuery("select r from Region r").getResultList();
	}
	
	public List<Country> findAllCountries() {
		return entityManager.createQuery("select c from Country c").getResultList();
	}	
	
	public List<Location> findAllLocations() {
		return entityManager.createQuery("select l from Location l").getResultList();
	}	
	
	public List<JobHistory> findAllJobHistory() {
		return entityManager.createQuery("select h from JobHistory h").getResultList();
	}
}
