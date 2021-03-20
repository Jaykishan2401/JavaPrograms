import java.util.Scanner;

public class Rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int a = 1; a<=5 ; a++) {
            double v = sc.nextDouble();
            double i = sc.nextDouble();

            double cl = 0.56 * Math.pow(i, 2);
            System.out.println(cl);
            System.out.println(i * v - cl);
        }
    }
}
