package objetos;

import java.util.Scanner;

public class PruebaCoche {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*Coche coche1 = new Coche();
		System.out.println("Marca: ");
		coche1.marca=entrada.nextLine();
		
		System.out.println("Modelo: ");
		coche1.modelo=entrada.nextLine();
		
		System.out.println("Potencia: ");
		coche1.potencia=entrada.nextInt();*/
		
		Coche coche2= new Coche();
		coche2.setMarca("Ford");
		coche2.setModelo("Mondeo");
		coche2.setPotencia(120);
		coche2.setVelocidadMax(40);
		coche2.acelerar();
		coche2.acelerar();
		coche2.acelerar();
		coche2.acelerar();
		
		System.out.println("El coche va a "+coche2.getVelocidad());
		
		coche2.frenar();
		System.out.println("El coche va a "+coche2.getVelocidad());
		
		Coche c3=new Coche("Seat", "Leon",105,170);
		Coche c4=new Coche("Opel","Astra2",75,110);
		
		

	}

}
