import java.util.Scanner;

public class Bak2525_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int sum = sc.nextInt();

        int a = h * 60 + m + sum;


        h = a/60;
        m = a%60;

        if (h >24){
            h = a/60 -24;
        }

        System.out.println(h+" "+m);


    }
}
