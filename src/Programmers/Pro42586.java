package Programmers;

public class Pro42586 {
    public static void main(String[] args) {



        Pro42586 pro42586 = new Pro42586();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println( pro42586.solution(progresses,speeds));


    }

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
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
            System.out.println(midle[i]);

        }



         return midle;
    }
}
