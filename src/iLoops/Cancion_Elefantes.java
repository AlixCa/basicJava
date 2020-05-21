package iLoops;

import libs.Input;

public class Cancion_Elefantes {
    public static void main(String[] args) {

        for (int repeticion = 1; repeticion <= 100; repeticion += 1) {

            if (repeticion == 1) {
                Input.print(repeticion + " elefante se columpiaba sobre la tela de una araña, como veia que resistia, fue a llamar a otro elefante");
                Input.print("\n");
            } else {
                Input.print(repeticion + " elefantes se columpiaban sobre la tela de una araña, como veían que resistia, fueron a llamar a otro elefante");
                Input.print("\n");
            }

        }

    }
}
