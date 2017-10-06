import java.util.Scanner;

public class EdadTrabajar {

	public static void main(String[] args) {
		System.out.println("Escribe tu edad:");
		
		Scanner lector = new Scanner (System.in);
		int edad;
		edad = lector.nextInt();
		
		if (edad >=16 && edad <= 65) {
			System.out.println("Edad de trabajar!!");
			
		}
		if (edad < 16){
			System.out.println("No tienes edad para trabajar por menor");
		}
		if (edad > 65) {
			System.out.println("No tienes edad para trabajar por jubilado");
		}

	}

}
