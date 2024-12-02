import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class exercici2 {
    public static void main(String[] args) {
        ArrayList<Integer> inputs = new ArrayList<>();
        ArrayList<Integer> numerosMagicos = new ArrayList<>();
        Scanner scan = new Scanner (System.in);
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            inputs.add (scan.nextInt());
            numerosMagicos.add(random.nextInt(0, 49));
        }
        System.out.println(encerts(inputs, numerosMagicos));
    }
    public static int encerts (ArrayList<Integer> inputs, ArrayList<Integer> numerosMagicos) {
        int encerts = 0;
        for (int i = 0; i < 6; i++) {
            if (numerosMagicos.contains(inputs.get(i))) encerts++;
        }
        return encerts;
    }
}
