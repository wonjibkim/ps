package Standard;

import java.util.Arrays;

public class ArrayEx2 {

    public static void main(String[] args) {

      int [] Array1 = new int[10];
      int [] Array2 = new int[10];
      int [] Array3 = new int []{100, 95, 80, 70, 60};
      char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i <Array1.length; i++) {
            Array1[i] = i + 1; // 1 ~ 10의 숫자를 순서대로 배열에 넣는다.
        }

        for (int i = 0; i <Array2.length; i++) {
            Array1[i] = i + 1; // 1 ~ 10의 숫자를 순서대로 배열에 넣는다.
        }
//
        System.out.println(Arrays.toString(Array2));
        System.out.println(Arrays.toString(Array3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(Array3);
        System.out.println(chArr);


    }
}
