package clase;
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		persona obj1 = new persona(null, null, null, null, null, 0, 0, 0);

		String Nom = JOptionPane.showInputDialog("Ingrese su Nombre: ");
		String Ape = JOptionPane.showInputDialog("Ingrese su Apellido: ");
		String cedu = JOptionPane.showInputDialog("Ingrese su cedula: ");
		
		//Peticion de fecha de nacimiento por partes
		
		JOptionPane.showMessageDialog(null, "Ingrese los datos de su fecha de nacimiento DIA / MES / A�O ");
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de su nacimiento: "));
	
		int mes= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de su nacimiento: "));
	
		int a�o = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el a�o de su nacimiento: "));
		String sex = JOptionPane.showInputDialog("Ingrese su sexo H:Hombre M:Mujer. ");
		String fechaN=   dia + " / " + mes + " / " + a�o ;
		
		double pagoH = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Pago por hora: "));
		int horasT = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus horas laborales; "));
	
		obj1.CalcularEdad(a�o);
		obj1.setNombres(Nom);
		obj1.setApellidos(Ape);
		obj1.setA�oN(a�o);
		obj1.setSexo(sex);
		obj1.setCedula(cedu);
		obj1.setFechaN(fechaN);
		JOptionPane.showMessageDialog(null, obj1.toString());
		
		trabajador obj2 = new trabajador (fechaN, fechaN, fechaN, fechaN, fechaN, a�o, a�o, a�o);
		trabajador obj3 = new trabajador("","",Nom, Ape, cedu, 0,0,a�o);

		obj2.setApellidos(obj1.getApellidos());
		obj2.setSexo(obj1.getSexo());
		obj2.setFechaN(obj1.getFechaN());
		obj2.setHoras_trabajadas(horasT);
		obj2.setCedula(obj1.getCedula());
		
		obj2.verificarEdad( 0, obj1.esMayorEdad(0, false ));
		obj2.calcularHorasExtras();
		obj2.CalcularSueldo();
		
		
		String  format1 = "\nnombre: " +obj2.getNombres()+"\nApellidos"+ obj2.getApellidos() +"\nCedula" +obj2.getCedula() +"\nsexo: " +obj2.getSexo() +"\nFecha de nacimiento: "+obj2.getFechaN();
		String format2 = "\nPago por Horas: " + obj2.getPago_hora() + "\nHoras loborables: " + obj2.getHoras_trabajadas()  + "\nSueldo: " + obj2.CalcularSueldo();
	
		 JOptionPane.showMessageDialog( null, format1 );
	      JOptionPane.showMessageDialog( null, format2 );
	
	
	
	}
}
