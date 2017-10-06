import java.util.Scanner;

public class GradosFarenheit {

	public static void main(String[] args) {
		System.out.println("Escribe una temperatura en grados:");
		
		Scanner lector= new Scanner(System.in);
		int grados;
		grados = lector.nextInt();
		
		double farenheit;
		
		farenheit = grados * 1.8 + 32;
		
		System.out.println("Conversión a Farenheit: " + farenheit);
	}

}
