import java.util.Scanner;

public class exercici6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double r = scan.nextDouble();
        double h = scan.nextDouble();
        scan.nextInt();
        String areaVolum = scan.nextLine();
        if (areaVolum.equals("a")) System.out.println(area(r, h));
        else System.out.println(volum (r, h));
    }
    public static double area (double r, double h) {
        return 2 * Math.PI * r * (r+h);
    }
    public static double volum (double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }
}
