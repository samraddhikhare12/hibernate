package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
*@author Samraddhi Khare
*@creation_date  27th sep 2:42AM
*@Modification_date 27th sep 2:42AM
*@version 3.0
*@copyright Zensar Technologies.
*@description It is a Country class
*/
@Entity
@Table(name="flag_1")
public class Flag {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 private int flagId;
 private String flagName;
 private String description;
 @OneToOne(mappedBy = "flag")
 //@JoinColumn(name="countryId")
 private Country country;
 

 
public int getFlagId() {
	return flagId;
}
public void setFlagId(int flagId) {
	this.flagId = flagId;
}
public String getFlagName() {
	return flagName;
}
public void setFlagName(String flagName) {
	this.flagName = flagName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}

}






