package com.idat.simple.claseuno.semanauno;

import com.idat.simple.claseuno.semanauno.bean.Alumno;

/**
 * @author daviddali
 * Clase para revisar el funcionamiento de espacio de memoria java: heap y stack
 *
 */
public class IdatHeapStack {
	
	public IdatHeapStack() {	
	}
	 
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		//variable primitiva (sera creado y almacenado en el stack memory dentro de main)
		int numeroDeDiaDelMes = 25;
		
		//revisar heap space
		Alumno alumnoLuis = new Alumno("Luis", 33);		
		Alumno alumnoJose = new Alumno("Jose", 25);		
		Alumno alumnoPedro = new Alumno("Pedro", 34);
		
		//revisar heap space
		IdatHeapStack idatHeapStack = new IdatHeapStack();
		idatHeapStack.alumnoIdat(alumnoLuis);
		
		//detenemos el hilo main para monitorear por: JMC - Java Mission Control y JVM - Java Visusal VM
		Thread.sleep(300000);
	}
	
	private void alumnoIdat(Alumno alumno){
		System.out.println("Alumno::nombre: "+alumno.getName());
	}
}
