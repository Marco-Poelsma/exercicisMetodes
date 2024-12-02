

import java.util.Scanner;

public class exercici1{
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        int n = scan.nextInt();
        parell(n);
    }
    public static void parell (int n) {
        if (n % 2 == 0) System.out.println("PARELL");
        else System.out.println("SENAR");
    }
}