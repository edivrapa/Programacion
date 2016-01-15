import javax.swing.JOptionPane;

public class AppDatos {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Alumno al = new Alumno("Efren", "Chisco", "Garcia", "18", "Zumpango","chonito@gmail.com","5542999839","2513220142","55050","Soltero","29 Marzo");
		
		JOptionPane.showMessageDialog(null,
				String.format("Hola  %s %s %s \n Edad: %s\n Vives en: %s\n Correo: %s\n Telefono: %s \n Matricula: %s \n Codigo Postal: %s \n Estado Civil: %s \n Fecha de Nacimiento: %s  ",
						al.getNombre(), 
						al.getApm(), 
						al.getApp(), 
						al.getEdad(), 
						al.getDireccion(), 
						al.getCorreo(), 
						al.getTelefono(), 
						al.getMatricula(), 
						al.getCodPostal(), 
						al.getEstadoCivil(), 
						al.getFechaNac()
						)
				);

	}

}
