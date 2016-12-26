package com.vaani.register.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	@Size(min=5)
	@Pattern(regexp="^[A-Za-z0-9]*$",message="Username can only contain alphanumeric values." )
	private String userName;
	
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
	@Pattern(regexp="((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})", message="The password has a minimum length of 8 characters and contains at least 1 number, 1 uppercase, and 1 lowercase character")
	@NotEmpty
	@Size(min=8)
	private String password;
	
	@NotEmpty
	@Email
	private String emailAddress;
	
	@NotNull
	@Past
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private Date dateOfBirth;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}	
}
