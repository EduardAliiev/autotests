package com.eduardaliiev.app.utils.enums;

public enum EnumNumbersOfMenus {
    EXIT("0"), FIRST("1"), SECOND("2"), THIRD("3"), FOURTH("4"), FIFTH("5"), SIXTH("6"), SKIP("-1");

    private String value;

    EnumNumbersOfMenus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}