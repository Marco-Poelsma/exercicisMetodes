import java.util.Scanner;

public class exercici5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double n = scan.nextDouble();
        System.out.println("C o F?");
        String celsiusFahrenheit = scan.nextLine();
        if (celsiusFahrenheit.equals("C")) System.out.println(fahrenheit(n));
        else System.out.println(celsius(n));
    }
    public static double fahrenheit (double input) {
        return (9.0/5)*input+32;
    }
    public static double celsius (double input) {
        return (5.0/9)*(input-32);
    }
}
