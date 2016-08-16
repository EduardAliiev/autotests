package com.eduardaliiev.utils.arrays.enigma;

public class EnigmaEncodeMethod {

    public void encodeMethod(String inputStringEnigma) {

        String originalText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXVZabcdefghijklmnopqrstuvwxyz ";
        String  cipherText = "QWERTYUIOPqwertyuiopASDFGHJKL 12345asdfghjklZXCVBNM67890zxcvbnm";

        StringBuilder stringBuilder = new StringBuilder(inputStringEnigma);
        for (int i = 0; i < inputStringEnigma.length(); i++) {
            for (int j = 0; j < originalText.length(); j++) {
                if (inputStringEnigma.charAt(i) == originalText.charAt(j)) {
                    stringBuilder.setCharAt(i, cipherText.charAt(j));
                    break;
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }
}