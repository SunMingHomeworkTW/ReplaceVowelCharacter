package com.tw.practice;

public class Util {
    static boolean isaLetter(char c) {
        boolean isLowerCase = c >= 'a' && c <= 'z';
        boolean isupperCase = c >= 'A' && c <= 'Z';

        return isLowerCase || isupperCase;
    }
}
