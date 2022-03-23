package homework;

import java.util.Arrays;
import java.util.Locale;

public class Homework7 {
    public static void main(String[] args) {

        // Due date: Mar 22, 2022

        // Task 1
        String staTement = "make America great again";
        String[] statementArray= staTement.split(" ");
        String newB ="";
        for(int i=0; i<statementArray.length; i++){
            newB = newB + statementArray[i].charAt(0);
        }
        System.out.println(newB.toUpperCase());

        String statement2 = "Good Morning";
        String[] statementArray1 = statement2.split(" ");
        String newD = "";
        for (int i=0; i<statementArray1.length; i++) {
            newD=newD + statementArray1[i].charAt(0);
        }
        System.out.println(newD);

        String staTement3 = "happy birthday to you dear friend";
        String[] statementArray2 = staTement3.split(" ");
        String newE = "";
        for (int i=0; i<statementArray2.length; i++) {
            newE = newE + statementArray2[i].charAt(0);

        }
            System.out.println(newE.toUpperCase());


        String staTement4 = "Hello";
        String[] statementArray3 =staTement4.split(" ");
        for (int i=0; i<statementArray3.length; i++) {
            System.out.println(statementArray3[i].toUpperCase().charAt(0));
        }

        String staTement5 = "Air balloon";
        String[] statementArray4 =staTement5.split(" ");
        String newA = "";
        for (int i=0; i<statementArray4.length; i++) {
            newA = newA + statementArray4[i].charAt(0);
        }
        System.out.println(newA.toUpperCase());

        // Task 2
        String reverseS = "make america great again";
        String[] revStatementArray = reverseS.split(" ");
        //System.out.println(Arrays.toString(revStatementArray));
        String newC = "";
        for (int i=1; i<=revStatementArray.length; i++) {
            newC = newC + " " + revStatementArray[revStatementArray.length-i];
        }
        newC=newC.trim();
            System.out.println(newC);

        String rev2 = "good Morning";
        String[] rev2Array = rev2.split(" ");
        String newF = "";
        for (int i=1; i<=rev2Array.length; i++) {
            newF = newF + " " + rev2Array[rev2Array.length-i];
        }
        newF=newF.trim();
        System.out.println(newF);


        String rev3 = "learn";
        String[] rev3Array = rev3.split(" ");
        String newM = "";
        for (int i=1; i<=rev3Array.length; i++) {
            newM = newM + " " + rev3Array[rev3Array.length-i];
        }
        newM=newM.trim();
        System.out.println(newM);

        String rev4 = "happy birthday to you";
        String[] rev4Array = rev4.split(" ");
        String newG = "";
        for (int i=1; i<=rev4Array.length; i++) {
            newG = newG + " " + rev4Array[rev4Array.length-i];
        }
        newG=newG.trim();
        System.out.println(newG);

        // Task 3
        String staTement6 = "make america great again";
        String[] titelCase = staTement6.split(" ");
        String newH = "";
            for (int i=0; i<titelCase.length; i++) {
               newH = newH + " " + titelCase[i].substring(0,1).toUpperCase() + titelCase[i].substring(1).toLowerCase();
            }
            newH = newH.trim();
                System.out.println(newH);

        String staTement7 = "gOOd morNING";
        String[] titelCase1 = staTement7.split(" ");
        String newP = "";
        for (int i=0; i<titelCase1.length; i++) {
            newP = newP + " " + titelCase1[i].substring(0,1).toUpperCase() + titelCase1[i].substring(1).toLowerCase();
        }
        newP = newP.trim();
        System.out.println(newP);

        String staTement8 = "learn";
        String[] titelCase3 = staTement8.split(" ");
        String newL = "";
        for (int i=0; i<titelCase3.length; i++) {
            newL = newL + " " + titelCase3[i].substring(0,1).toUpperCase() + titelCase3[i].substring(1).toLowerCase();
        }
        newL = newL.trim();
        System.out.println(newL);

        String staTement9 = "happy birTHday TO yOu";
        String[] titelCase4 = staTement9.split(" ");
        String newK = "";
        for (int i=0; i<titelCase4.length; i++) {
            newK = newK + " " + titelCase4[i].substring(0,1).toUpperCase() + titelCase4[i].substring(1).toLowerCase();
        }
        newK = newK.trim();
        System.out.println(newK);


       //  * Q4:
         int[] numbers = {-1, 1};
                int minVal = numbers[0];
            for (int i=0; i<numbers.length; i++){
            if (numbers[i] < minVal)
                minVal = numbers[i];
            }
        System.out.println(minVal);


            int[] numbers1 = {1, 21, 87, 23};
        int minVal1 = numbers1[0];
        for (int i=0; i<numbers1.length; i++){
            if (numbers1[i] < minVal1)
                minVal1 = numbers1[i];
        }
        System.out.println(minVal1);


        int[] numbers2 = {87, 23, 89, 0, 54, 23};
        int minVal2 = numbers2[0];
        for (int i=0; i<numbers2.length; i++){
            if (numbers2[i] < minVal2)
                minVal2 = numbers2[i];
        }
        System.out.println(minVal2);
















    }
}
