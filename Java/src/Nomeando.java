import javax.swing.*;
public class Nomeando {

    public static void main(String[] args) {

        {
            int numero1 = 5;
            int numero2 = 2;
            double resultado = ((double) numero1 / numero2);
            System.out.println("Resultado da divisao: " + resultado);
            System.out.println("Resto da divisao: " + 5 % 2);

            //boolean divisivel = numero1 % numero2 == 0;
        }

        short a = 260;
        byte b = (byte) a;
        System.out.println("Valor de B: " + b);

    }
}

