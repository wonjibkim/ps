package Programmers;

import java.util.Arrays;

public class pro0102 {


    class Solution {
        public int solution(int[] d, int budget) {
            int answer = 0;

            Arrays.sort(d);

            int sum = 0;
            for (int i = 0; i < d.length; i++) {
                sum += d[i];

                if (sum > budget) {
                    answer = i;
                    break;
                } else if (sum == budget) {
                    answer = i + 1;
                    break;
                }
            }

            return answer;
        }
    }

}
