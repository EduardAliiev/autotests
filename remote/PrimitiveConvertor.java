package com.EduardAliiev.utils.convertors;
public class PrimitiveConvertor
{
    float floatToChar = 101;
    int intToChar = 38;
    char charToInt = 'M';

    public void convertor()
    {
        charToInt = (char) floatToChar;
        charToInt = (char) intToChar;
        intToChar = (int) charToInt;

        System.out.println(" Input float value is " + floatToChar + ". Output char value is " + charToInt);
        System.out.println(" Input int value is " + intToChar + ". Output char value is " + charToInt);
        System.out.println(" Input char value is " + charToInt + ". Output int value is " + intToChar);

    }
}

