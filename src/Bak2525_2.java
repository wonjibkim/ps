import java.util.Scanner;

public class Bak2525_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = 60 * a + b;
        min += c;

        System.out.println((min/60)+" " +(min %60));
    }
}
