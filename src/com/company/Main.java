package com.company;

import java.util.Scanner;

public class Main {

    String cipher(String message, int offset) {
        // To hold the cipher text
        StringBuilder result = new StringBuilder();

        // Character by character encryption
        for (char character : message.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';

                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);

                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main cipher = new Main();

        int offset = sc.nextInt();

        String cipheredMessage = cipher.cipher(
                "I enjoy learning from scalar topics",offset
        );
        System.out.println(cipheredMessage);
    }
}