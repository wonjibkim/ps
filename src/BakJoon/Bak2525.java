package BakJoon;

import java.util.Scanner;

public class Bak2525 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int ho, mi ,fi,mem1, mem2;

        ho = in.nextInt();
        mi = in.nextInt();
        fi = in.nextInt();

        if (mi + fi > 60){

            mem1=(mi + fi) / 60; //3
            mem2=(mi + fi) % 60;  //50


            ho = ho + mem1;


            if (ho >=24){
                ho = 0;
                ho = ho + mem1;
            }

            if (60 == mem2){
                fi =0;
            }else {
                fi = 60 -mem2;
            }



            System.out.println(ho+" " +fi);


        }else{
            System.out.println(ho+" " +(mi + fi));
        }



    }
}
