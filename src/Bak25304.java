import java.util.Scanner;

public class Bak25304 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        int get = sc.nextInt();
        int tf = 0;

        for (int i = 1; i <=get ; i++) {

            int anf = sc.nextInt();
            int scn = sc.nextInt();

           tf +=(anf*scn);

        }


        if (money == tf){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
