package com.zensar.entities;
import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/**
*@author samraddhi khare
*@creation_date  27th sep 11:47AM
*@Modification_date 27th sep 11:47AM
*@version 1.0
*@copyright Zensar Technologies.
*@description It is a persistance class

**/

@Entity
@DiscriminatorValue("sam")
public class WageEmp extends Employee {
 private int hours;
 private float rate;
 public WageEmp() {

}
public WageEmp(int empId, String name, LocalDate joinDate, double salary, int hours, float rate) {
	super(empId, name, joinDate, salary);
	this.hours = hours;
	this.rate = rate;
}

public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
public float getRate() {
	return rate;
}
public void setRate(float rate) {
	this.rate = rate;
}
@Override
public String toString() {
	return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
}
 
}
