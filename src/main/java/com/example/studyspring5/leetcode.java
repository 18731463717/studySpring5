package com.example.studyspring5;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/5 12:28
 */
public class leetcode {
    public static void main(String[] args) {
        int c = 0;
        int[] nums = {2,3,1,0,2,5,2};
        for(int i =0 ; i<7;i++){
            for(int j = i+1;j < 7;j++){
                if(c != nums[j]){
                    if(nums[i] == nums[j]){
                        System.out.println(nums[j] + "\n");
                        c = nums[j];
                    }
                }
            }
        }
    }

}
