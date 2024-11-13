package sumando;
import java.util.Scanner;
public class Sumando {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

	        System.out.print("Introduce el primer número: ");
	        int num1 = entrada.nextInt();

	        System.out.print("Introduce el segundo número: ");
	        int num2 = entrada.nextInt();

	        int suma = num1 + num2;

	        System.out.println("La suma de los dos números es: " + suma);
	        
	        entrada.close();

	}

}
