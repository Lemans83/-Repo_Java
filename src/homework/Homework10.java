package homework;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;

public class Homework10 {
    public static void main(String[] args) {
        //Task 1
        System.out.println("\nTask 1");
        ArrayList<String> list = new ArrayList<>();
        list.add("Happy");
        list.add("GroW");
        list.add("LeaRN");
        list.add("PeaCEfUL");
        list.add("Learning");
        list.add("HAPPy");
        list.add("Growing");
        list.add("ListeN");
        list.add("PEACE");
        list.add("King KONG");
        list.add("happiness");
        list.add("greeN");
        list.add("SkiLLS");
        list.add("PRICELeSs");
        list.add("Health");
        list.add("NEW");
        list.add("LAUgh");
        list.add("QUeeN");
        list.add("YouNG");
        list.add("OLD");
        list.add("HAPPy");
        list.add("Growing");
        list.add("ListeN");
        list.add("PEACE");
        list.add("King KONG");
        list.add("happiness");
        list.add("greeN");
        list.add("SkiLLS");
        list.add("PRICELeSs");
        list.add("Health");
        list.add("NEW");
        list.add("LAUgh");
        list.add("King KONG");
        list.add("happiness");
        list.add("greeN");
        list.add("SkiLLS");
        list.add("PRICELeSs");
        list.add("Health");
        list.add("NEW");
        list.add("LAUgh");

        int matchingWords = getArraylist("happy",list);
        System.out.println(matchingWords);

      // Task 2
        System.out.println("\nTask 2");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Happy");
        list1.add("GroW");
        list1.add("LeaRN");
        list1.add("PeaCEfUL");
        list1.add("Learning");
        list1.add("HAPPy");
        list1.add("Growing");
        list1.add("ListeN");
        list1.add("PEACE");
        list1.add("King KONG");
        list1.add("happiness");
        list1.add("greeN");
        list1.add("SkiLLS");
        list1.add("PRICELeSs");
        list1.add("Health");
        list1.add("NEW");
        list1.add("LAUgh");
        list1.add("QUeeN");
        list1.add("YouNG");
        list1.add("OLD");
        list1.add("HAPPy");
        list1.add("Growing");
        list1.add("ListeN");
        list1.add("PEACE");
        list1.add("King KONG");
        list1.add("happiness");
        list1.add("greeN");
        list1.add("SkiLLS");
        list1.add("PRICELeSs");
        list1.add("Health");
        list1.add("NEW");
        list1.add("LAUgh");
        list1.add("King KONG");
        list1.add("happiness");
        list1.add("greeN");
        list1.add("SkiLLS");
        list1.add("PRICELeSs");
        list1.add("Health");
        list1.add("NEW");
        list1.add("LAUgh");

        int containWords = countArrlist("HAp",list);
        System.out.println(containWords);

        int containWords1 = countArrlist("A", list);
        System.out.println(containWords1);


        // Task 3
        System.out.println("\nTask 3");
        int[] number = {25,34,44,532,20,234,12,54,56,199};
        int[] number1 = remVal(number,44);
        System.out.println(Arrays.toString(number1));

    }

    // Task 1
    public static int getArraylist (String checkVal, ArrayList<String> countArr ){
        int countN = 0;
        for (int i=0; i < countArr.size(); i++) {
            if (countArr.get(i).equalsIgnoreCase(checkVal)){
                countN++;
            }
        }
        return countN;
    }

    // Task 2
    public static int countArrlist (String checkVal, ArrayList<String> countVal) {
        int listVal = 0;
        for (int i = 0; i < countVal.size(); i++) {
            if (countVal.get(i).contains(checkVal.toLowerCase())){
                listVal++;
            }
        }
        return listVal;
    }

       // Task 3
        public static int[] remVal (int[] inputArr, int remNumb){

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < inputArr.length; i++) {
                list.add(inputArr[i]);
            }

            list.remove(new Integer(remNumb));

            int[] newArr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                newArr[i] = list.get(i);
            }
            return newArr;
        }








    }






    /**
     * Q3:
     * Create a method to return an int-array after removing input-int-value from an input-int-array
     *
     * -> How to create List using Array and vice-versa
     *
     * create a List using values of input-int-array
     * remove the input-int-value from List
     * create an int-array using List-values
     * return int-array
     *
     */


//    String name = "George";
//    boolean isCharPresent = name.contains("K");
//        System.out.println(isCharPresent);
//


