package com.idat.simple.claseuno.semanauno.bean;

public class Alumno {
	private String name;
	private int edad;
	
	public Alumno() {	
	}
	
	public Alumno (String name, int edad){
		this.name = name;
		this.edad = edad;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}	
}
