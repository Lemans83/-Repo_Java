package operators;

public class JavaOperators {
    public static void main(String[] args) {

        /**
         * Due date: Mar 8 2022
         * Refer for formulas: https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html
         *
         * 1) C -> F
         * 2) C -> K
         * 3) F -> C
         * 4) F -> K
         * 5) K -> C
         * 6) K -> F
         */

        /**
         * Convert degree-Celsius into deg-Fahrenheit
         *
         * fT = cT × 9/5 + 32 // formula for converting the celcius to fareignheit
         * T(K) = T(°C) + 273.15
         * T (°C) = (T(°F) - 32) × 5/9
         * T(K) = (T(°F) + 459.67)× 5/9
         * T(°C) = T(K) - 273.15
         * T(°F) = T(K) × 9/5 - 459.67
         */


        double cTemp = 25.3;
        double fTemp = cTemp * 9 / 5 + 32;
        System.out.println("\n" + cTemp + "˚C is equal to " + fTemp + "˚F");

        double kTemp = cTemp + + 273.15;
        System.out.println("\n" + cTemp + "˚C is equal to " + kTemp + "˚K");

        // Convert F value to C

        double fTemp1 = 50;
        double cTemp1 = (fTemp1 -32) * 5/9;
        System.out.println("\n" + fTemp1 + "˚F is equal to " + cTemp1 + "˚C");

        // Convert F value to K
        double fTemp2 = 55;
        double kTemp1 = (fTemp2 + 459.67) * 5/9;
        System.out.println("\n" + fTemp2 + "°F is equal to " + kTemp1 + "˚K");

        // Convert K to C

        double kTemp3 = 60;
        double cTemp3 = kTemp3 - 273.15;
        System.out.println("\n" + kTemp3 + "˚K is equal to " + cTemp3 + "˚C");

        // Convert K to F
        double fTemp4 = 45;
        double kTemp4 = fTemp4 * 9/5 - 459.67;
        System.out.println("\n" + fTemp4 + "˚K is equal to " + kTemp4 + "°F");


    }

}
