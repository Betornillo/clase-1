import java.util.Scanner;


public class Ejemplo
{
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa el primer numero que quieres sumar");
		int primero = 0;
		primero = input.nextInt();
		System.out.println("El primer numero es: " + primero);
		System.out.println("Ingresa el segundo numero que quieres sumar");
		int segundo = 0;
		segundo = input.nextInt();
		System.out.println("El segundo numero es: " + segundo);
		System.out.println("Hare una suma!");
		System.out.println("Sumare: " + primero + " + " + segundo);
		int resultado = primero + segundo;
		System.out.println("El resultado es: " + resultado);
	}
}