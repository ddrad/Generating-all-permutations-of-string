package com.azarov.projects.intervew.job.acvelon;

import java.util.Arrays;

/**
 * Copyright DonRiver Inc. All Rights Reserved.
 *
 * @Author: Dmitry Azarov
 * @Created: 2017-05-02
 *
 * we receive string which has length equals 3 symbols
 * we need return all possible sorts
 */
public class StringGenerator {

    public void stringenrator(String str){

        char[] ch = str.toCharArray();
        int len = ch.length;
        rec(ch, len);
    }

    private void rec (char[] ch, int len) {
        if(len < 1 )
            System.out.println(Arrays.toString(ch));
        for(int i = 0; i < len ; i++){
            swapped(ch, i, len-1);
            rec(ch, len - 1);
            swapped(ch, len-1, i);
        }
    }

    private void swapped(char[] ch, int i, int j) {
        char tmp = ch[i];
        ch[i] = ch[j];
        ch[j] = tmp;
    }
}
