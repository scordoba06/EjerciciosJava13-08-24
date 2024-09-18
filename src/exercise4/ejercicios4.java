package exercise4;

import java.util.Scanner;

public class ejercicios4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double valor = 166.386;
		System.out.print("Ingrese cuantos Euros va a convertir a pasetas:");
		double euros1 = teclado.nextDouble();
		double pesetas = euros1 * valor;
		System.out.println(euros1 + " euros son equivalentes a " + pesetas + "pesetas." );
		teclado.close();
	}

}
