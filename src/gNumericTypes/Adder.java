package gNumericTypes;

import libs.Input;

public class Adder {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is: "); // funcion para imprimir en consola
	    int x = Input.get_int(); // Funcion para recibir el valor de X
	    
	    // prompt user for y
	    System.out.print("y is: "); // funcion para imprimir en consola
	    int y = Input.get_int(); // Funcion para recibir el valor de Y
	    
	    // calculate sum for user
	    System.out.println("sum is " + (x + y) + "\n"); // Resultado de la operacion
	}
}