package clase;
import javax.swing.JOptionPane;
public class persona {
private String Nombres, Apellidos, FechaN, cedula;
String sexo;
private int edad,a�oN;
private boolean resp;

public persona(String Nombres, String Apellidos, String FechaN, String cedula,String sexo, int edad, int a�oN, int a�o) {
	this.Nombres = Nombres;
	this.Apellidos = Apellidos;
	this.FechaN = FechaN;
	this.cedula = cedula;
	this.sexo = sexo;
	this.edad= edad;
	a�oN= a�o;
}

public String getNombres() {
	return Nombres;
}

public void setNombres(String nombres) {
	Nombres = nombres;
}


public String getApellidos() {
	return Apellidos;
}


public void setApellidos(String apellidos) {
	Apellidos = apellidos;
}

public String getFechaN() {
	return FechaN;
}


public void setFechaN(String fechaN) {
	FechaN = fechaN;
}


public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
	this.cedula = cedula;
}

public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public int getA�oN() {
	return a�oN;
}

public void setA�oN(Object object) {
	this.a�oN = a�oN;
}

//Calculo por peticion del profesor

public int CalcularEdad(int a�oN) {
	return edad = (a�oN - 2020)*(-1);
}
public boolean esMayorEdad(int edad,boolean resp) {
	if(edad>=18) {
		resp = true;
	}
	else {
		resp = false;
	}
	return resp;
}

public String toString() {
	String format = "Nombre: " + Nombres +  "\nApellido: " + Apellidos + "\ncedula: " +  cedula  + "\nfecha de Nacimiento: "   + FechaN  + "\nEdad: "   + edad  + "\nsexo: "  + sexo;
		return format;
}






}