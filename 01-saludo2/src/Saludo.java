import javax.swing.JOptionPane;

/**
 * 
 * @author Edgar Iván Ramírez Pavía 
 *
 */
public class Saludo {
	/**
	 * 
	 * @param args En el metodo principal imprimimos el nombre y la edad del autor utilizando una ventana 
	 */
	public static void main(String[]args){
		String nombre="Edgar";
		String edad= "22";
		//Error: System.out.println("Hola"+nombre); Esto es por que consume mucha memoria ram
		//Correcto:  System.out.printf("Hola: %s", nombre); Por que concatenamos con el comodin %s
		JOptionPane.showMessageDialog(null, String.format("Hola: %s tu edad es: %s años", nombre, edad));
		
	}

}
