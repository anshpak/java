package main;

import action.BWT;

public class Main {
    public static void main(String[] args) {
        String encryptedWord = "|Jvaa";
        String word = BWT.decode(encryptedWord);
        System.out.println(encryptedWord);
        System.out.println(word);
    }
}