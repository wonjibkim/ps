import java.util.Scanner;

public class Bak2559 {

    static int[] temp ;
    static int N, K; // N 온도를 측정한 전체 날짜의 수 , K는 합을 구하기 위한 연속적인 날짜의 수
    static int Answer = Integer.MIN_VALUE;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 전체 날짜
        K = sc.nextInt(); // 연속 날짜

        temp = new int [N];

        for ( int i=0; i<N; i++) {
            temp[i] = sc.nextInt();
        }

        for ( int i=0; i<=N-K; i++) {
            int sum =0;
            for ( int j=i; j<i+K; j++) {
                sum += temp[j];
            }
            Answer = Math.max(Answer, sum);
        }

        System.out.println(Answer);
    }
}