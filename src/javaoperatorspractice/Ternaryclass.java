package javaoperatorspractice;

public class Ternaryclass {

    public static void main(String[] args) {

        /**
         * Ternary (?:)
         *
         * Syntax
         * Variable = condition(s) ? ValueIfTrue : ValueIfFalse
         */
        //mortgageRate = 2.5/3.5 (creditScore > 700 / Otherwise ) - Example
        //mortgageRate = 2.5/3.5 (creditScore > 700 or you are first time buyer / Otherwise )

        double myMoney = 500.5;
        String Result = myMoney > 400 ? "I am right" : "I am wrong";
        System.out.println(Result);

        int myBank = 10000;
        int result2 = myBank > 5000 ? 345 : 255;
        System.out.println(myBank);

        int nhb = 88;
        String result3 = nhb > 90 ? "True" : "False";
        System.out.println(result3);

        double myCheck = 350.5;
        String result4 = myCheck < 250? "Ture" : "False";
        System.out.println(result4);

        int mybalance = 6000000;
        String result5 = mybalance < 300000? "True" : "False";
        System.out.println(result5);

        double myaccount = 10.5;
        String result6 = myaccount > 9.5? "True" : "False";
        System.out.println(result6);


    }
}
