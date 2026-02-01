package com.index;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int[] a = {1, 1, 0, 1, 1, 1, 0, 1};

        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count++;               
                if (count > maxCount) {
                    maxCount = count;  
                }
            } else {
                count = 0;             
            }
        }

        System.out.println("Maximum consecutive 1's: " + maxCount);
    }
}


