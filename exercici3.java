import java.util.Scanner;
public class exercici3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        while (true) { 
            menu();
            String[] input = scan.nextLine().toLowerCase().split("\s+");
            if (input[0].equals("s")) break;
            int n1 = Integer.parseInt(input[0]);
            int n2 = Integer.parseInt(input[2]);
            switch (input[1]) {
                case "+" -> System.out.println(suma(n1, n2));
                case "-" -> System.out.println(resta (n1, n2));
                case "*" -> System.out.println(producte(n1, n2));
                case "/" -> System.out.println(divisio(n1, n2));
                case "^" -> System.out.println(potencia(n1, n2));
                default -> System.out.println("Operació invàlida. Si us plau, comprova els arguments.");
            }
        }
    }
    public static int suma (int n1, int n2) {
        return n1 + n2;
    }
    public static int resta (int n1, int n2) {
        return n1 - n2;
    }
    public static int producte (int n1, int n2) {
        return n1 * n2;
    }
    public static int divisio (int n1, int n2) {
        return n1 / n2;
    }
    public static double potencia (int n1, int n2) {
        return Math.pow (n1, n2);
    }
    public static void menu () {
        System.out.println("Benvingut a la calculadora! \n Introdueix la operació que vols realitzar:");
        System.out.println("Recorda que ambdós inputs han de ser enters.");
        System.out.println("Escriu 's' per a sortir");
    }
}
