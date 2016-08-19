package com.eduardaliiev.utils.arrays.enigma;

public class EnigmaDecodeMethod extends EnigmaCipherMethod {

    public void decodeMethod(String inputStringEnigma) {

        StringBuilder stringBuilder = new StringBuilder(inputStringEnigma);
        for (int i = 0; i < inputStringEnigma.length(); i++) {
            for (int j = 0; j < getCipherText().length(); j++) {
                if (inputStringEnigma.charAt(i) == getCipherText().charAt(j)) {
                    stringBuilder.setCharAt(i, getOriginalText().charAt(j));
                    break;
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }
}