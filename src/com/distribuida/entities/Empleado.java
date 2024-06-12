package com.distribuida.entities;

public class Empleado {

	private int idEmpleado;
	private int nombre;
	private int apellido1;
	private int apellido2;
	private int dni;
	private int fechaNac;
	private int direccion;
	private int sexo;
	private int sueldo;
	private int superdni;
	private int dno;
	
	public Empleado() {	}

	public Empleado(int idEmpleado, int nombre, int apellido1, int apellido2, int dni, int fechaNac, int direccion,
			int sexo, int sueldo, int superdni, int dno) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechaNac = fechaNac;
		this.direccion = direccion;
		this.sexo = sexo;
		this.sueldo = sueldo;
		this.superdni = superdni;
		this.dno = dno;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public int getApellido1() {
		return apellido1;
	}

	public void setApellido1(int apellido1) {
		this.apellido1 = apellido1;
	}

	public int getApellido2() {
		return apellido2;
	}

	public void setApellido2(int apellido2) {
		this.apellido2 = apellido2;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(int fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getDireccion() {
		return direccion;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getSuperdni() {
		return superdni;
	}

	public void setSuperdni(int superdni) {
		this.superdni = superdni;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + ", fechaNac=" + fechaNac + ", direccion=" + direccion + ", sexo=" + sexo
				+ ", sueldo=" + sueldo + ", superdni=" + superdni + ", dno=" + dno + "]";
	}
	
	
	
}
