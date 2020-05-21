package gNumericTypes;

import libs.Input;

public class botellasAgua
{
    public static float get_positive_value()
    {
        float n;
        do
        {
            System.out.println("Introduce en minutos el tiempo que estuviste bajo el agua: ");
            n = Input.get_float();
        }
        while (n <= 0);
        return n;
    }
    public static void main(String[] args)
    {
        float minutosBajoAgua = get_positive_value();
        System.out.println("Las cantidades de botellas que usaste son: " + minutosBajoAgua*12);
    }
}





