package com.tolgadagidir.permutation;

import java.util.*;
public class CheckPermutation {
    static boolean checkPermutation(String str1, String str2){
        if(str1 == null || str2 == null) return false;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(ch1.length != ch2.length)    return false;
        for (int i=0 ; i<ch1.length ; i++)
            if (ch1[i]!=ch2[i]) return false;
        return true;
    }


    public static void main(String[] args) {
        System.out.println(checkPermutation("baba","abab"));
        System.out.println(checkPermutation("baba","abc"));
        System.out.println(checkPermutation("lds","loodos"));
    }
}