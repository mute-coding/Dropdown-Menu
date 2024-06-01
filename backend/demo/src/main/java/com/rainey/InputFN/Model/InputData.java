package com.rainey.InputFN.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "InputData")
public class InputData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "name")
	private String name;
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getNAME() {
		return name;
	}
	public void setNAME(String name) {
		this.name = name;
	}
}
