package com.eduardaliiev.app.methods.objectorientedparadigm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhiteCollar extends Human {

    private String company;

    public void setCompany(String company) {
        Pattern p = Pattern.compile("([a-zA-Z]{1,20}[\\s]{0,1}[\\-]{0,1}[\\,]{0,1}[\\s]{0,1})+");             // Разрешено от 1 до 10 символов большие и маленькие, тире или пробел или запятая
        Matcher m = p.matcher(company);
        boolean pm = m.matches();

        if (pm == true) {
            this.company = company;
            System.out.println("Company name is " + company);
            System.out.println("\nAt the moment in this company " + company + " isn't employees,\nbut we have good candidate"
                    + "\nhis name is "
                    + getName() + "\nhis age is " + getAge()
                    + "\nand finally he is works: " + getPosition());
        } else {
            System.out.println("Company name is invalid :(");
        }
    }
}