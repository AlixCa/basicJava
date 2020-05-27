package jStrings;

import libs.Input;

public class ConversionSegundos {
    public static void main(String[] args) {


            System.out.println("duracion del video: (segundos)");
            int duracionVideo = Input.get_int();


            int seg = duracionVideo%60;
            int min = duracionVideo/60;
            if (min < 10 && seg <10) {
                System.out.println("Los minutos son: 0" +min+":0" +seg);
            }else if (min <10 && seg >10){
                System.out.println("Los minutos son: 0" +min+":" +seg);
            }else if (min >10 && seg< 10){
                System.out.println("Los minutos son: " +min+":0" +seg);
            }else
                System.out.println("Los minutos son: " +min+":" +seg);



    }
}
