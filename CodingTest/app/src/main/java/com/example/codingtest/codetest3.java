package com.example.codingtest;

public class codetest3 {

    private int[]a = {1,4,6,5,8,5,5};

    public int grabmostcommon(int[]a) {
        int count = 7, tempcount;
        int common = a[0];
        int temp = 0;
        for (int x = 0; x < (a.length - 1); x++) {
            temp = a[x];
            tempcount = 0;
            for (int y = 1; y < a.length; y++) {
                if (temp == a[y])
                    tempcount++;
            }
            if (tempcount > count) {
                common = temp;
                count = tempcount;
            }
        }
        return common;
    }
}

