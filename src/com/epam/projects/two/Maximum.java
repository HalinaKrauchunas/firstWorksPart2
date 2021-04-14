package com.epam.projects.two;

import com.epam.projects.*;

import static java.lang.Math.*;

public class Maximum {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader(System.in);
        Double numberA = ParseNumber.getDouble(reader);
        Double numberB = ParseNumber.getDouble(reader);
        Double numberC = ParseNumber.getDouble(reader);
        Double numberD = ParseNumber.getDouble(reader);

        System.out.println(max(min(numberA, numberB), min(numberC, numberD)));
    }

}
