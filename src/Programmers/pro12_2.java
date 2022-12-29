package Programmers;

import java.util.ArrayList;
import java.util.List;

class pro12_29 {
    public int[] solution(int[] answers) {
        int[] player1 = { 1, 2, 3, 4, 5 };
        int[] player2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] player3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int[] answer = new int[] {0,0,0};
        int maxNum = 0;

        List<Integer> countNum = new ArrayList<Integer>();

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == player1[i%5]) {
                answer[0]++;
            }

            if(answers[i] == player2[i%8]) {
                answer[1]++;
            }

            if(answers[i] == player3[i%10]) {
                answer[2]++;
            }
        }

        for(int i : answer) {
            if(i > maxNum) {
                maxNum = i;
            }
        }

        for(int i=0; i<3; i++) {
            if(answer[i] == maxNum) {
                countNum.add(i+1);
            }
        }
        return countNum.stream().mapToInt(i->i).toArray();
    }
}
