package javaoperatorspractice;

public class Conceptjavaclass {

    public static void main(String[] args) {

        /**
         * String: is a non-primitive datatype.
         *  can store single or multiple characters
         *
         *  Value must be enclosed in double quotes while storing value in String-variable.
         *
         * --> String is a Class
         *
         */
        // 1. Method
        String name = "Deepak";
        /**
         * start index = 0
         * length = 6
         * last index = 5
         */
        //My example
        String name1 = "Masrur";
        char result = name1.charAt(4);
        System.out.println(result);
        System.out.println(name1.charAt(0)); // I extracted the character (based on the index) from the string.

        String modelC = "Opel Astra G"; // I assigned the variable to my value
        char result1 = modelC.charAt(7); // I wanted to find a single character (by indicating number) in my value
        System.out.println(result1);     // Then i printed the char to see what is that character
        System.out.println(modelC.charAt(5)); // then used the sout by adding variable to find what is the letter for number 5

        String myLocation = "I am located in the New York City";
        char result2 = myLocation.charAt(9);
        System.out.println(result2);
        System.out.println(myLocation.charAt(6));


        //2. Method
        String statement = "new York times";
        System.out.println("statement -> " + statement);
        /**
         * start index = 0
         * length = 14
         * last index = 13
         *
         * last Index = length - 1
         * index-value is ALWAYS int
         * lastIndex can NEVER be equal or greater than to length
         *
         */

        String stmt = "";
        //My example
        String lastN = "Karimov";
        System.out.println(lastN.length()); // 7
        System.out.println(lastN.length()-1); // 6
        System.out.println(lastN.charAt(6)); // count from 0

        String mystatement = "My name is Masrur and I love listening the music";
        System.out.println(mystatement);
        System.out.println(mystatement.length()); // i do length to find the total number in my stsmt
        System.out.println(mystatement.length()-5);
        System.out.println(mystatement.charAt(42));
        System.out.println(mystatement.charAt(11));






    }


}
