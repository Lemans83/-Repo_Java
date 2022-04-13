package homework;

import java.util.*;

public class Honework11 {
    public static void main(String[] args) {
        //Task 1
        String[] name = {"Tajikistan", "USA", "India", "USA",};
        System.out.println(findDuplicate(name));

        //Task 2
        System.out.println(duplVal(name));


    }


    //Task 1
    public static boolean findDuplicate(String[] newDupl) {
        ArrayList<String> duplVal = new ArrayList<>(Arrays.asList(newDupl));
        Set<String> newVal = new HashSet<>(duplVal);
        boolean nameDupl = (duplVal.size() == newVal.size());

        return nameDupl;
    }

    // Task 2
    public static ArrayList duplVal(String[] newVal) {
        List<String> returnDupl = new ArrayList<>();
        for (int i = 0; i < newVal.length; i++) {
            for (int j = i + 1; j < newVal.length; j++) {
                if(newVal[i].equalsIgnoreCase(newVal[j])) {
                    returnDupl.add(newVal[i]);
                }
            }
        }

        return (ArrayList) returnDupl;
    }


}
