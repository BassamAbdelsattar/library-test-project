package com.siliconnile.library.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.pearlox.framework.domain.BasicObject;

@Entity
@Table(name = "reader")
public class Reader extends BasicObject {
	private String readerName;
	private Date registrationDate;

	@Column(name = "name")
	public String getReaderName() {
		return readerName;
	}

	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}

	@Column(name = "registration_date")
	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

}
