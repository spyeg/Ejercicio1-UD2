package mostrandodatos;
import java.util.Scanner;
public class MostrandoDatos {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

	        System.out.print("Introduce tu nombre: ");
	        String nombre = entrada.nextLine();

	        System.out.print("Introduce tu apellido: ");
	        String apellido = entrada.nextLine();

	        System.out.println("Hola, " + nombre + " " + apellido + "!");
	        entrada.close();
	        

	}

}
