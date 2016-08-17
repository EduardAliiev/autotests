package com.eduardaliiev.utils.arrays.objectorientedparadigm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhiteCollar extends Human {
    Scanner scanner = new Scanner(System.in);

    private String company;

    public WhiteCollar(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }
    public void setCompany(String company) {
        Pattern p = Pattern.compile("(([a-zA-Z]){0,15}[\\s]{0,1}||[\\-]{0,1}||[\\,]{0,1}[\\s]{0,1})+");             // Разрешено от 1 до 15 символов большие и маленькие, тире или пробел или запятая
        Matcher m = p.matcher(company);
        if (m.matches()) {
            this.company = company;
            System.out.println("Company name is ");
            System.out.println("Human name is " + getName() + " age " + getAge());
        }else {
            System.out.println("Company name is invalid :(");
        }
    }
 }
