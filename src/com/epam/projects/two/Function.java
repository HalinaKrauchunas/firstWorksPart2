package com.epam.projects.two;

import com.epam.projects.*;

import static java.lang.Math.*;

public class Function {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader(System.in);
        double x = ParseNumber.getDouble(reader);
        if (x <= 3) {
            System.out.println(pow(x, 2) - 3 * x + 9);
        } else {
            System.out.println(1 / (pow(x, 3) + 6));
        }
    }
}
