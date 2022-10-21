import java.util.Scanner;

public class Bak10818_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int  N = sc.nextInt(); // 초기 갯수값 구하기//
        int [] num = new int [N]; // 초기 갯수에 맞게 배열크기 설정

        int max=0;



        for (int i = 0 ; i <N; i++) {
            num[i] = sc.nextInt(); // 배열에 숫자 넣기

            max = num[i];

        }

        int min = num[0];

        for (int i = 0 ; i <N; i++) {

            if (num[i] > num[0]){
                 max = num[i];
            }

            if (num[i] < num[0]){
                min = num[i];
            }

        }



        System.out.println("최대"+max+"  최소:"+ min);



    }

}
