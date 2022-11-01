package Programmers;

public class PR {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] midle = {progresses.length};
        int j = 0;

        for (int i = 0; i < speeds.length ; i++) {

            while (true){
                j++;
                if (100 <= progresses[i] + speeds[i] * j){
                    midle[i] =j;
                    j =0;
                    break;
                }

            }







        }

        System.out.println(midle);
    }
}
