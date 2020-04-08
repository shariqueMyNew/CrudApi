package com.portal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "template2")
public class AvailabilityModel {

	@Id
	private String templateName;
	private String userID;
	private String origin;

	public AvailabilityModel() {

	}

	@Override
	public String toString() {
		return "AvailabilityModel{" +
				"templateName='" + templateName + '\'' +
				", userID='" + userID + '\'' +
				", origin='" + origin + '\'' +
				'}';
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
}
