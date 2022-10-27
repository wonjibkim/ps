package Programmers;

import java.util.Arrays;
import java.util.Scanner;

class Solution{
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for(int i=1; i<n; i++)
        {
            answer[i] = answer[i-1] + x;
        }

        return answer;
    }
}
public class Pro12954 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        Solution sol = new Solution();

        long[] answer = new long[n];

        answer = sol.solution(x, n);

        System.out.println(Arrays.toString(answer));
    }

}