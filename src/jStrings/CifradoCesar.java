package jStrings;
import libs.Input;
public class CifradoCesar {
        public static void main(String[] args) {
            //Recorrer el mensaje for(int i = 0; i < numeroCaracteres; i++) {
            // Tomo la letra actual
            // Le sumo la clave
            // Si la suma es mayor a 90 le resta 26
            //Convierto la suma en char y la imprimo. Suma = 76 ((char) suma)

            System.out.println("Introduce el mensaje: ");
            String mensaje =Input.get_string();
            System.out.println("Introduce la clave: ");
            int clave = Input.get_int();
            System.out.println("Mensaje cifrado: ");
            for(int i = 0; i < mensaje.length(); i++) {
                if (mensaje.charAt(i) >= 'A' && mensaje.charAt(i) <= 'Z') {
                    char actual = mensaje.charAt(i);
                    int suma = actual + clave;
                    if (suma > 90){
                        suma = suma - 26;
                    }
                    char desencripta = ((char) suma);
                    System.out.print(desencripta);
                }
                else{
                    System.out.print(mensaje.charAt(i));
                }
            }

        }

    }

