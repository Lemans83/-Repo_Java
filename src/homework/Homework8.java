package homework;

import java.nio.channels.CancelledKeyException;

public class Homework8 {

    public static void main(String[] args) {

        // Task 1
        String sentence = "make america great again";
        System.out.println(Homework8.makeAbbreviation(sentence));

        String sentence1 = "outfit of the day";
        System.out.println(Homework8.makeAbbreviation(sentence1));

        String sentence2 = "happy birthday to you";
        System.out.println(Homework8.makeAbbreviation(sentence2));

        String sentence3 = "Good morning";
        System.out.println(Homework8.makeAbbreviation(sentence3));

        String sentence4 = "Happy new Year";
        System.out.println(Homework8.makeAbbreviation(sentence4));

        String sentence5 = "Happy birthday to you dear";
        System.out.println(Homework8.makeAbbreviation(sentence5));

        String sentence6 = "Happy new year to you dear";
        System.out.println(Homework8.makeAbbreviation(sentence6));

        // Task 2
        String titleC = "HappY nEW YEAR to YoU dEAr";
        System.out.println(Homework8.title(titleC));

        String titleB = "good Morning";
        System.out.println(Homework8.title(titleB));

        String titleG = "make AMERICA GreAT AgAIn";
        System.out.println(Homework8.title(titleG));

        // Task 3
        int[] num = {23,67,900,56,567906};
        System.out.println(Homework8.findMax(num));

        // Task 4

        String sent = "hello";
        String rev = (Homework8.palinDrome(sent));
        boolean task = sent.equals(rev);
        System.out.println((task));

        String sent1 = "eye";
        String rev1 = (Homework8.palinDrome(sent1));
        boolean task1 = sent1.equals(rev1);
        System.out.println((task1));

        String sent2 = "eYe";
        String rev2 = (Homework8.palinDrome(sent2));
        boolean task2 = sent2.equals(rev2);
        System.out.println((task2));

        String sent3 = "Eye";
        String rev3 = (Homework8.palinDrome(sent3));
        boolean task3 = sent1.equals(rev3);
        System.out.println((task3));

        // Task 5
        String[] words = {"happy", "Happy new year", "peaceful", "king kong"};
        System.out.println(Homework8.maxLength(words));

    }

    // My methods:
    public static String makeAbbreviation(String sentence){
        String[] words =sentence.split(" ");
        String newH = "";
        for(int i = 0; i < words.length; i++){
            newH = newH + words[i].toUpperCase().charAt(0);
        }
        return newH;
        }

        public static String title (String sentence) {
        String[] titleCase = sentence.split(" ");
        String newH = "";
        for (int i=0; i<titleCase.length; i++) {
            newH = newH + " " + titleCase[i].substring(0,1).toUpperCase() + titleCase[i].substring(1).toLowerCase();
        }
        newH = newH.trim();
        return newH;
        }

        public static int findMax (int[] maxNum) {
            int maxVal = maxNum[0];
            for (int i = 0; i < maxNum.length; i++) {
                if (maxNum[i] > maxVal) {
                    maxVal = maxNum[i];
                }
            }
            return maxVal;
        }

        public static String palinDrome (String reverse) {
       // String reverseS = " ";
        String[] revStatementArray = reverse.split("");
        String newC = "";
            for (int i=1; i<=revStatementArray.length; i++) {
                newC = newC + revStatementArray[revStatementArray.length-i];
            }
            newC=newC.trim();
            return newC;
        }

   public static String maxLength (String[] word) {
       String len = word[0];
       for(int i = 0; i < word.length; i++) {
           if (word[i].length()>len.length()) {
               len=word[i];
           }
       }
       return len;
   }


}





