package br.com.unicuritiba.torneiodopoder;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class TorneioDoPoderModel {
	
	@Entity
	@Table(name = "teste")
	public class EmployeeEntity implements Serializable {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer employeeId;

	  private String email;

	  private String firstName;

	  private String lastName;

	public EmployeeEntity(Integer employeeId, String email, String firstName, String lastName) {
		super();
		this.employeeId = employeeId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;				
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	  
	}
	
}
