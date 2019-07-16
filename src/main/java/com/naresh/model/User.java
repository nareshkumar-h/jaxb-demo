package com.naresh.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
  <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<user>
<name>Naresh</name>
<email>naresh@gmail.com</name>
<password>pass123</password>
</user>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="user")
public class User {

	@XmlElement
	private Integer id;
	
	@XmlElement
	private String name;
	
	@XmlElement
	private String email;
	
	@XmlElement
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
