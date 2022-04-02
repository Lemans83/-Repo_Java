package homework;

import java.util.Arrays;

public class CodetestHomework {

    public static void main(String[] args) {
        //Task 1
        int[] values = new int[]{32, 54, 12, 67, 2, 5};
        int[ ]sortArray = sortArray(values);
        System.out.println(Arrays.toString(sortArray));

        int[] values1 = new int[]{5, 4, 3, 1, 2};
        int[ ]sortArray1 = sortArray(values1);
        System.out.println(Arrays.toString(sortArray1));


        //Task 2
        int num0 = (123);
        System.out.println(sumOfNumbers(123));

        int num = (323);
        System.out.println(sumOfNumbers(323));

        int num1 = (90);
        System.out.println(sumOfNumbers(90));


        // Task 3
        int[] numbersArray = {54, 67, 12, 34, 23, 56};
        int removeFromArr = 23;
        int[] newArray = remInt(numbersArray,removeFromArr);
        System.out.println(Arrays.toString(newArray));

        int[] numbersArray1 = {23, 5, 67, 87, 10, 5, 34, 98, 66, 55};
        int removeFromArr1 = 5;
        int[] newArray1 = remInt(numbersArray1,removeFromArr1);
        System.out.println(Arrays.toString(newArray1));


        // Task 4
        String[] array1 = {"happY", "king", "peace", "living standard", "bmw"};
        String[] array2 = {"king kong", "Happy", "PEACE", "Zaparozh"};
        printRepeatedStrings(array1, array2);

        String[] array5 = {"ab", "abcd", "abc", "abcde", "defg", "koli"};
        String[] array6 = {"abcde", "jhuy", "plot", "koli"};
        printRepeatedStrings(array5, array6);

    }


    // Method 1
    public static int[] sortArray (int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        return array;
    }


    // Method 2
    public static int sumOfNumbers (int numb){
        String number = String.valueOf(numb);
        String[] digitArray = number.split("");
        int sum = 0;
        for (int i = 0; i < digitArray.length; i++) {
            sum += Integer.valueOf(digitArray[i]);
        }
        return sum;


     }
     // Method 3
     public static int[] remInt(int[] numArray, int valInp) {
         int specNumber = 0;
         for (int i = 0; i < numArray.length; i++) {
             if (valInp != numArray[i]) {
                 specNumber++;
             }
         }

         int[] arrNew = new int[specNumber];
         int counter = 0;
         for (int i = 0; i < numArray.length; i++) {
             if (valInp != numArray[i]) {
                 arrNew[counter] = numArray[i];
                 counter++;
             }
         }
         return arrNew;
     }

    // Method 4
    public static void printRepeatedStrings(String[] arrayOne, String[] arrayTwo){
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i].equalsIgnoreCase(arrayTwo[j])){
                    System.out.println(arrayOne[i].toLowerCase());
                }
            }
        }
    }
     }


        















