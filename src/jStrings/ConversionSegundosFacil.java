package jStrings;
    import libs.Input;

    public class ConversionSegundosFacil {

        public static void main(String[] args) {

            do {
                System.out.println("duracion del video: (mm:ss)");
                String duracionVideo = Input.get_string();


                int min = 0;
                int seg = 0;
                String[] minutos = duracionVideo.split(":");
                if (minutos.length == 2) {
                    try {
                        min = Integer.parseInt(minutos[0]);
                        seg = Integer.parseInt(minutos[1]);
                        if (seg < 0 || seg >= 60) {
                            System.out.println("Cantidad incorrecta de segundos..");
                        } else {
                            System.out.println("El total del video en segundos es: " + (min * 60 + seg));
                            break;
                        }

                    } catch (NumberFormatException ex) {
                        System.out.println("Error en la recepcion de datos. el formato correcto es mm:ss");
                    }
                } else {
                    System.out.println("Formato incorrecto...");

                }


            } while (true);
            //ciclo hasta que de un valor correcto.
            //1.  tiene dos valores el split
            //2.  tanto minutos como segundos deben ser enteros
            //3.  los segundos deben ser 0 y 59

        }
    }

