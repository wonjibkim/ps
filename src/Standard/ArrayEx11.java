package Standard;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int [] numArr = new int[10];
        int [] counter = new int[10];

        for(int i =0; i < numArr.length; i++){
            numArr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length ; i++) {
          counter[   numArr[i]   ]++;
        }

        for (int i = 0; i < numArr.length ; i++) {
            System.out.println(i+ "+의 갯수 : " + counter[i]);
        }
    }
}



