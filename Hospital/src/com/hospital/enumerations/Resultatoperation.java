package com.hospital.enumerations;

public enum Resultatoperation {

	ENCOURS("Encours"),
	BIEN("Bien passe"),
	Ratee("Ratée");
	
	private String value;
	
	Resultatoperation(String value) {
		this.value = value;
	}
	
	
	public String getValue() {
		return value;
	}
	
}
