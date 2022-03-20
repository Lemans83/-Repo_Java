package homework;


import java.util.Arrays;

public class Homework6 {
    public static void main(String[] args) {

// Due date: Sunday Mar 20

        // Task 1
           String country1 = "Uzbekistan";
           System.out.println("Country is " + country1);

           String[] splitCountry = country1.split("");
           System.out.println(Arrays.toString(splitCountry));

           int length = splitCountry.length;
           System.out.println("The length is -> " + length);

           // Task 2
           String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
           int number = sentence2.length();
           System.out.println("The total number of words is -> " + number);

        // Task 3
            String sentence3 = "outFit OF the DAY";
            String abbr = "make america great Again";
            String upperC = abbr.toUpperCase();
            String[] abbr1 = upperC.split(" ");
            System.out.println(Arrays.toString(abbr1));
            System.out.println(abbr1[0].substring(0,1) + abbr1[1].substring(0,1) + abbr1[2].substring(0,1) + abbr1[3].substring(0,1));

           String abbr2 = "outfit of the day";
           String upperC1 = abbr2.toUpperCase();
           String[] upCase = upperC1.split(" ");
           System.out.println(Arrays.toString(upCase));
           System.out.println(upCase[0].substring(0,1) + upCase[1].substring(0,1) + upCase[2].substring(0,1) + upCase[3].substring(0,1));

           String wordN = "happy birthday to you";
           String upperC2 = wordN.toUpperCase();
           String[] result = upperC2.split(" ");
           System.out.println(Arrays.toString(result));
           System.out.println(result[0].substring(0,1) + result[1].substring(0,1) + result[2].substring(0,1) + result[3].substring(0,1));

        //Task 4
        int num = 100;
        if (num % 5 == 0 && num % 3 ==0)
        {
            System.out.println(num + " is divisible by 5 and 3");
        } else if (num % 3 == 0 ) {
            System.out.println(num + " is divisible by 3");
        } else if (num % 5 == 0 ) {
            System.out.println(num + " is divisible by 5");
        } else{
            System.out.println("NOT divisible by 5 and 3");
        }


        //Task 5
        double studentScore = 95;
        int maxScore = 100;
        double percentage = (studentScore / maxScore) * 100;

        if (percentage >= 81 && percentage < 91) {
            System.out.println(percentage + " is garde B");
        } else if (percentage >= 91 && percentage <= 100) {
            System.out.println(percentage + " is grade A");
        } else if (percentage >= 71 && percentage < 81) {
            System.out.println(percentage + " is grade C");
        } else {
            System.out.println(percentage + "\n Invalid percentage score is entered");
        }

        // Task 6
        String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live", "give", "living standard", "life"};
        for(int i = 0; i <=words.length-1; i++){

            if (words[i].startsWith("l") && words[i].length() > 5) {
                System.out.println(words[i]);
            }




    }
}