package com.epam.projects.two;

import com.epam.projects.*;

import static com.epam.projects.MethodsForFunctions.*;

public class CoordinatesInSpace {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader(System.in);
        double x1 = ParseNumber.getDouble(reader);
        double y1 = ParseNumber.getDouble(reader);
        double x2 = ParseNumber.getDouble(reader);
        double y2 = ParseNumber.getDouble(reader);
        double x3 = ParseNumber.getDouble(reader);
        double y3 = ParseNumber.getDouble(reader);

        if (findAreaTriangleByCoordinates(x1, y1, x2, y2, x3, y3) == 0.0) {
            System.out.println("The points are on the same line");
        }
        else {
            System.out.println("Points are not on the same line");
        }
    }
}
