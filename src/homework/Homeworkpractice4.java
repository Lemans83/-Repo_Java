package homework;

public class Homeworkpractice4 {
    public static void main(String[] args) {

        /**
         * Task: verify if statement("nEw YorK TimES") contains "NeW"
         * Note: pls ignore the cases
         * Expected result: true
         *
         * ---> Pseudo coding <---
         * convert statement into uppercase -> "NEW YORK TIMES" (statement_U)
         * convert "NeW" into uppercase -> "NEW" (new_U)
         * apply contains method on statement_U with new_U
         *
         */

        //Homework Practice
        String cityName = "NeW YOrk tImeS";
        String cityN = "New";
        boolean result1 = cityName.toUpperCase().contains(cityN.toUpperCase());
        System.out.println(result1);
        System.out.println("\n" + cityName.toUpperCase().contains(cityN.toUpperCase()));

        String myCity = "NeW hamPshiRe";
        String CorrectN = "New Hampshire";
        Boolean realname = myCity.equalsIgnoreCase(CorrectN);
        System.out.println(realname);
        System.out.println("\n" + myCity.equalsIgnoreCase(CorrectN));

    }
}
