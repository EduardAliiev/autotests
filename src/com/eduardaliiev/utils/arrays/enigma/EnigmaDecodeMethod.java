package com.eduardaliiev.utils.arrays.enigma;

public class EnigmaDecodeMethod {

    public void decodeMethod(String inputStringEnigma) {

        String originalText = "QWERTYUIOPqwertyuiopASDFGHJKL 12345asdfghjklZXCVBNM67890zxcvbnm";
        String cipherText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXVZabcdefghijklmnopqrstuvwxyz ";

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

