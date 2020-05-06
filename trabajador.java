package clase;
import javax.swing.JOptionPane;
public class trabajador extends persona {

	private String Nombres;
	private String Apellidos;
	private String FechaN;
	private String cedula;
	String sexo;
	private int edad,añoN;
	private double pago_hora;
	private int horas_trabajadas;
	private boolean resp;
	private double extra_h;
	private double sueldo;
	public trabajador(String Nombres, String Apellidos, String FechaN, String cedula, String sexo, int edad, int añoN,
			int año) {
		super(Nombres, Apellidos, FechaN, cedula, sexo, edad, añoN, año);
		
		
	}

	



	public int getHoras_trabajadas() {
		return horas_trabajadas;
	}

	public void setHoras_trabajadas(int horas_trabajadas) {
		this.horas_trabajadas = horas_trabajadas;
	}


	public double getPago_hora() {
		return pago_hora;
	}


	public void setPago_hora(double pago_hora) {
		this.pago_hora = pago_hora;
	}


//metodos de validacion
	public void verificarEdad(int edad, boolean resp) {
		
	if (resp == false ) {
		JOptionPane.showMessageDialog(null,"Usted no es trajador");
	}
	}
	
	public void calcularHorasExtras(){
		
		if(horas_trabajadas > 40) {
			 extra_h = horas_trabajadas - 40;
		}
		else {
			extra_h = 0;
		}
		
	}

	public double CalcularSueldo() {
		if(horas_trabajadas >= 41) {
			 sueldo = ((horas_trabajadas-extra_h)*pago_hora) + (extra_h*(pago_hora*1.5)) ;
		}
		else {
			sueldo = horas_trabajadas * pago_hora;
		}
		return sueldo;
	}

	public String toString() {
		return  "Nombre: " + Nombres +  "\nApellido: " + Apellidos + "\ncedula: " +  cedula  + "\nfecha de Nacimiento: "   + FechaN  + "\nEdad: "   + edad  + "\nsexo: "  + sexo + "\npago por hora: " + pago_hora + "\n Horas Trabajadas" + horas_trabajadas + "\nHoras Extras" + extra_h + "Sueldo: " + sueldo;
	}

	
}
