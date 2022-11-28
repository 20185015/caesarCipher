package com.company;

import java.util.Scanner;

public class Main {

    String cipher(String message, int offset) {
        // To hold the cipher text
        StringBuilder result = new StringBuilder();

        // Character by character encryption
        for (char x : message.toCharArray()) {
            if (x != ' ') {
                double original_alphabet_position = x - 'a';

                // Applying Caesar Cipher Encryption Technique to the input text
                double newAlphabetPosition = (original_alphabet_position + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);

                // Adding the new character to the result
                result.append(newCharacter);
            } else {
                result.append(x);
            }
        }
        return result.toString();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Main cipher = new Main();

        int offset = sc.nextInt();

        String m = cipher.cipher(
                "I enjoy learning from scalar topics",offset
        );
        System.out.println(m);
    }
}