import java.text.DecimalFormat;
import java.util.Scanner;

public class exercici4 {
    public static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        double venta = scan.nextDouble();
        calcula_bonificacion(venta);
    }
    public static void calcula_bonificacion (double venta) {
        DecimalFormat df = new DecimalFormat("#0.00");
        double bonificacion = 0;
        if (venta < 20000) bonificacion = 7000 + venta*0.02;
        else if (venta >= 20000 && venta < 50000) bonificacion = 15000 + venta*0.03;
        else bonificacion = 20000 + venta*0.12;
        System.out.println(df.format(bonificacion));
    }
}
