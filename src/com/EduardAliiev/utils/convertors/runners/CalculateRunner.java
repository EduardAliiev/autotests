package com.EduardAliiev.utils.convertors.runners;

import com.EduardAliiev.utils.convertors.menus.CalculateMenu;

public class CalculateRunner {

        public static void main(String args[]) {
            CalculateMenu.run();
            CircleArea.calculateArea();
            CircleRadius.calculateBigger();
            EvenOrOdd.calculateEvenOrOdd();
            AngledTriangle.calculateAngledTriangle();
        }
    }
