package com.epam.projects.two;

import com.epam.projects.*;

public class Triangle {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader(System.in);
        double angleA = ParseNumber.getDouble(reader);
        double angleB = ParseNumber.getDouble(reader);
        double sumAngles = angleA + angleB;

        if (sumAngles > 180) {
            System.out.println("It's not triangle.");
        } else if (sumAngles == 90 || angleA == 90 || angleB == 90) {
            System.out.println("Rectangular!");
        } else {
            System.out.println("Triangle, but not rectangular");
        }
    }
}

