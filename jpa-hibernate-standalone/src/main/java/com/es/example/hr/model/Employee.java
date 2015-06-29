package com.es.example.hr.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEES")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EMPLOYEE_ID", nullable = false)
	private int id;	
	
	@Column(name="FIRST_NAME", nullable = false)
	private String firstName;
	
	@Column(name="LAST_NAME", nullable = false)
	private String lastName;
	
	@OneToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name="JOB_ID", nullable=false)
	private Job job;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name="DEPARTMENT_ID")
	private Department department;
	
	@OneToMany(mappedBy="employee", fetch = FetchType.EAGER)
	private Set<JobHistory> jobHistory;	
	
//	@ManyToOne(optional = false, fetch = FetchType.EAGER)
//	@JoinColumn(name="MANAGER_ID", nullable=false)	
//	private Employee manager;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Set<JobHistory> getJobHistory() {
		return jobHistory;
	}

	public void setJobHistory(Set<JobHistory> jobHistory) {
		this.jobHistory = jobHistory;
	}
	
	

//	public Employee getManager() {
//		return manager;
//	}
//
//	public void setManager(Employee manager) {
//		this.manager = manager;
//	}
}
