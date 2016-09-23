package com.eduardaliiev.app.methods.arrays.enigma;

public class EnigmaCipherMethod {

    private String originalText;
    private String cipherText;

    public EnigmaCipherMethod(String originalText, String cipherText) {
        this.originalText = originalText;
        this.cipherText = cipherText;
    }

    public EnigmaCipherMethod() {
        this.originalText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXVZabcdefghijklmnopqrstuvwxyz ";
        this.cipherText = "QWERTYUIOPqwertyuiopASDFGHJKL 12345asdfghjklZXCVBNM67890zxcvbnm";
    }

    public String getOriginalText() {
        return originalText;
    }

    public String getCipherText() {
        return cipherText;
    }
}
