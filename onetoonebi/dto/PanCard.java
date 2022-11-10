package com.ty.onetoonebi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int panId;
private String name;
private String panCardNo;
@OneToOne(mappedBy = "card")
private Person person;
public int getId() {
	return panId;
}
public void setId(int id) {
	this.panId = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPanCardNo() {
	return panCardNo;
}
public void setPanCardNo(String string) {
	this.panCardNo = string;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}


}
