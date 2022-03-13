package homework;

import java.util.Locale;

public class Homework5 {
    public static void main(String[] args) {

        /**
         * Due date: Mar 13 (Sunday)
         */

        /**
         * Task -1
         * using Ternary operator assign value to int-variable
         *
         * Variable -> result1
         * if the length of sentence1-String is greater or equals to 5
         *      value in result1 should be 10
         * else
         *      value in result should be 15
         *
         * print:
         *      value of sentence1
         *      length of sentence1
         *      value of result1
         */
        String sentence1 = "hhhh";

        int numb1 = 100;

        //My work 1)
        String iceCream = "My playstation";
        int iceCream1 = iceCream.length();

        System.out.println(iceCream);
        System.out.println(iceCream1);

        String iceCream2 = iceCream1 >= 10 ? "True" : "False";
        System.out.println(iceCream2);

        // My work 2
        String statement = "George";
        int statement1 = statement.length();

        System.out.println(statement);
        System.out.println(statement1);

        int result = statement1 <= 7 ? 5 : 10;
        System.out.println(result);

        /**
         * Task - 2
         *
         * Create a String Variable and store your full name in it.
         * Print the following values:
         *  1. length of your full name
         *  2. check if your name ends with "a" (ignore the case)
         *  3. check if your name contains with "a" (ignore the case)
         */
        //My work 3
        String statement2 = "Karimov Masrur";
        int statement3 = statement2.length();
        String checkN = "a";
        boolean result2 = statement2.endsWith("a");
        System.out.println(result2);
        // My work 4
        String fullName = "Larry King";
        String fullName2 = "g";
        boolean result3 = fullName.endsWith(fullName2);
        System.out.println(result3);

        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        /**
         * Print the results for:
         *  1. task3-value contains "king" (ignore cases)
         *  2. index of first occurrence of "EW" (ignore cases)
         */

        String bigNews = "View the lATesT neWs and BreaKing news TodAy for U.S., WorLD, WeATheR";
        String conTains1 = "king";
        boolean result6 = bigNews.contains(conTains1);
        System.out.println(result6);

        String index = "EW";
        int result7 = bigNews.indexOf("EW");
        System.out.println(result7);


        String task4 = "kINg";
        /**
         * Convert the value in task4 variable into Titlecase
         *      (FirstCharacterUppercase and rest all in lowercase)
         *
         * "kINg" -> "King"
         * "QUEEN" -> "Queen"
         */

        String title = "kINg";
        String title1 = title.toLowerCase();
        System.out.println(title1);
        System.out.println(title1.replace("k", "K"));


       String title3 = "QUEEN";
       String title4 = title3.toLowerCase();
       System.out.println(title4);
       System.out.println(title4.replace("q", "Q"));

    }
}