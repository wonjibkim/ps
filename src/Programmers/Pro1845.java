package Programmers;

import java.sql.SQLOutput;
import java.util.*;

public class Pro1845 {
    public static void main(String[] args) {

        int[] nums = {3,3,3,2,2,2};
        int answer = 0;


        Set<Integer> set = new HashSet<Integer>();


        for (int i = 0; i < nums.length ; i++) {
            set.add(nums[i]);

        }
        if (nums.length/2 < set.size()){

            answer = nums.length/2;
        }else {
            answer = set.size();
        }

        System.out.println(answer);
    }

}

