package Standard;

import java.util.Arrays;

public class ArrayEx10 {
    public static void main(String[] args) {
        int [] numbArr = new int [10];

        for (int i =0;  i < numbArr.length; i++){
            System.out.print(numbArr[i] = (int)(Math.random() * 10));
        }
        System.out.println(" ");

        for (int i = 0; i <numbArr.length-1; i++){
            boolean changed = false;

            for (int j =0; j < numbArr.length-1-i; j++){
                if (numbArr[j] > numbArr[j+1]){
                    int temp = numbArr[j];
                    numbArr[j] = numbArr[j +1];
                    numbArr[j + 1] =temp;
                    changed = true;
                }
            }
            if(!changed) break;

        }
        System.out.println("for문 밖의 출력");
        System.out.println(Arrays.toString(numbArr));
    }
    
    
    
}
