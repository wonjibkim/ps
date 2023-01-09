package Programmers;


import java.util.ArrayList;
import java.util.Arrays;

class Pro0109 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {0};

        ArrayList<Integer> list = new ArrayList<Integer>();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);           // list에 추가
                count++;            // 나누어 떨어지는 element가 하나도 없을 경우를 대비해 count값 계산
            }
        }

        if (count != 0) {       // 나누어 떨어지는 element가 하나라도 존재한다면
            answer = new int[list.size()];          // answer배열의 크기는 list의 크기만큼
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            Arrays.sort(answer);        // 오름차순 정렬 함수 이용
        }
        else {              // 나누어 떨어지는 element가 하나도 없다면
            answer = new int[1];        // answer배열의 크기는 1만큼
            answer[0] = -1;
        }

        return answer;
    }
}