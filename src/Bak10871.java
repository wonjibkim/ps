import java.util.Scanner;

public class Bak10871 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int N = in.nextInt();
            int X = in.nextInt();
            int arr[] = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }

            in.close();

            for (int i = 0; i < N; i++) {
                if (arr[i] < X) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

