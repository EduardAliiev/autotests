package com.eduardaliiev.app.arrays.enigma;

public class EnigmaEncodeMethod extends EnigmaCipherMethod {

    public void encodeMethod(String inputStringEnigma) {

        StringBuilder stringBuilder = new StringBuilder(inputStringEnigma);
        for (int i = 0; i < inputStringEnigma.length(); i++) {
            for (int j = 0; j < getOriginalText().length(); j++) {
                if (inputStringEnigma.charAt(i) == getOriginalText().charAt(j)) {
                    stringBuilder.setCharAt(i, getCipherText().charAt(j));
                    break;
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
