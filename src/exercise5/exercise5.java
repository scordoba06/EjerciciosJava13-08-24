package exercise5;

import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double valor = 0.0016;
		System.out.print("Ingrese cuantos el numero de pesetas a convertir en Euros:");
		double pesetas = teclado.nextDouble();
		double euros = pesetas * valor;
		System.out.println(pesetas + " pesetas son equivalentes a "+ euros + "euros.");
		teclado.close();
	}

}
