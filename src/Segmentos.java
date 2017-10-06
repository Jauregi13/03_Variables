import java.util.Scanner;

public class Segmentos {
	/*
	pedir 2 segmentos con inicio y final 
	*/
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe inicio de segmento a:");
		int aIni = lector.nextInt();
		System.out.println("Escribe final de segmento a:");
		int aFin = lector.nextInt();
		System.out.println("Escribe inicio de segmento b:");
		int bIni = lector.nextInt();
		System.out.println("Escribe final de segmento b:");
		int bFin = lector.nextInt();
		
		if(aIni <= bIni && aFin >= bIni){
			System.out.println("Los segmentos se solapan");
		}
		else if(aIni >= bIni && bFin >=aIni){
			System.out.println("Los segmentos se solapan");
		}
		else if(aIni <= bIni && aFin >=bFin){
			System.out.println("Los segmentos se solapan");
		}
		else if(aIni >= bIni && aFin <=bFin){
			System.out.println("Los segmentos se solapan");
		}
		else {
			System.out.println("Los segmentos no se solapan");
		}

	}

}
