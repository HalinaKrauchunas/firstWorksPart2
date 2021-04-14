package com.epam.projects;

public class ParseNumber {

    public static Double getDouble(InputStreamReader reader) {

        String inputString = reader.readLine();
        try {
            return Double.parseDouble(inputString);
        } catch (NumberFormatException e) {
            System.out.println("Error! You entered not a number. This variable will be assigned the default value \"1" +
                ".0\"");
            return 1.0;
        }
    }

    public static long getLong(InputStreamReader reader) {

        String inputString = reader.readLine();
        try {
            return Long.parseLong(inputString);
        } catch (NumberFormatException e) {
            System.out.println("Error! This variable will be assigned the default value 1");
            return 1;
        }
    }
        public static int getPositiveInt(InputStreamReader reader) throws Exception {

            String inputString = reader.readLine();
            try { if (Integer.parseInt(inputString) < 0) throw new Exception("You entered a negative number");
                return Integer.parseInt(inputString);
            } catch (NumberFormatException e) {
                System.out.println("Error! This variable will be assigned the default value 1");
                return 1;
            }
        }
}
