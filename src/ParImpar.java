import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		System.out.println("Introduce un numero:");
		Scanner lector = new Scanner(System.in);
		
		int numero;
		numero = lector.nextInt();
		
		if(numero % 2 == 0){
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}

	}

}
