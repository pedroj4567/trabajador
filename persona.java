package clase;
import javax.swing.JOptionPane;
public class persona {
private String Nombres, Apellidos, FechaN, cedula;
String sexo;
private int edad,añoN;
private boolean resp;

public persona(String Nombres, String Apellidos, String FechaN, String cedula,String sexo, int edad, int añoN, int año) {
	this.Nombres = Nombres;
	this.Apellidos = Apellidos;
	this.FechaN = FechaN;
	this.cedula = cedula;
	this.sexo = sexo;
	this.edad= edad;
	añoN= año;
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

public int getAñoN() {
	return añoN;
}

public void setAñoN(Object object) {
	this.añoN = añoN;
}

//Calculo por peticion del profesor

public int CalcularEdad(int añoN) {
	return edad = (añoN - 2020)*(-1);
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