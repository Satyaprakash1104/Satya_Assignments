package com.loopAssignements;

public class AlphabetOrNot {
    public static void main(String[] args) {

        char c = 'e';

        if (c >= 'a'&& c <= 'z' || c >= 'A' && c <= 'Z') {
            System.out.println(c +" is  a alphabet");
        }
        else{
            System.out.println(c + " is not a alphabet");
        }
    }
}
