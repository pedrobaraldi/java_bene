public class Main {
    public static void main(String[] args) {

        /*
        {
            byte idade = 127;
            short pequeno = 1500;
            int preferido = 1_000_000;
            long meuPreferido = 20_000_000;
         }

        */


        {
            byte minimo = Byte.MIN_VALUE;
            byte maximo = Byte.MAX_VALUE;
            System.out.println("\n--------------BYTE--------------");
            System.out.println("Byte - O valor minimo: " + minimo);
            System.out.println("Byte - O valor maximo: " + maximo);
        }
        {
            short minimo = Short.MIN_VALUE;
            short maximo = Short.MAX_VALUE;
            System.out.println("\n---------------SHORT----------------");
            System.out.println("|Short - O valor minimo: " + minimo);
            System.out.println("|Short - O valor maximo: " + maximo);
        }
        {
            int minimo = Integer.MIN_VALUE;
            int maximo = Integer.MAX_VALUE;
            System.out.println("\n-----------------INT-----------------");
            System.out.println("Int - O valor minimo: " + minimo);
            System.out.println("Int - O valor maximo: " + maximo);
        }

        {
            long minimo = Long.MIN_VALUE;
            long maximo = Long.MAX_VALUE;
            System.out.println("\n----------------------LONG----------------------");
            System.out.println("Long - O valor minimo: " + minimo);
            System.out.println("Long - O valor maximo: " + maximo);
        }

    }


}





