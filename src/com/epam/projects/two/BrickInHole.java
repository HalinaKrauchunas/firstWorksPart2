package com.epam.projects.two;

import com.epam.projects.*;

import java.util.*;

public class BrickInHole {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader(System.in);
        double sideRectangularA = ParseNumber.getDouble(reader);
        double sideRectangularB = ParseNumber.getDouble(reader);
        double brickLength = ParseNumber.getDouble(reader);
        double brickWidth = ParseNumber.getDouble(reader);
        double brickHeight = ParseNumber.getDouble(reader);

        double[] sidesRect = {sideRectangularA, sideRectangularB};
        double[] brickDimension = {brickHeight, brickLength, brickWidth};
        Arrays.sort(sidesRect);
        Arrays.sort(brickDimension);

        if ((sidesRect[0] >= brickDimension[0] && sidesRect[1] >= brickDimension[1])) {
            System.out.println("Passes!");
        } else {
            System.out.println("Smaller brick required!");
        }
    }
}