package javaoperatorspractice;

public class Logicalclass {
    public static void main(String[] args) {

        /**
         * Logical (&&, II, !)
         *
         * && -> And operator
         * II -> Or operator
         * ! -> Not operator
         *
         * We use the logical operators to join two or more conditions.
         * The final result will be always "Boolean datatype"
         *
         * && operator (and operator)
         * all combined conditions must be true to get final result as true
         * if any one of the conditions is false, final result is false.
         *
         * || operator (or operator)
         * any one of the combined conditions has to be true to get final result as true
         * if all combined conditions are false, then final result is false.
         *
         * ! operator (not operator)
         * not operator will make true as false and vice versa
         */

        int lVar1=10, lVar2=20, lVar3=30, lVar4=40;

        boolean lRes1 = (lVar2 == lVar4+lVar3) && lVar1 <= lVar3;
        /*
            (lVar2 == lVar4+lVar3) && lVar1 <= lVar3
            (20 == 40+30) && 10 <= 30
            (20 == 70) && 10 <= 30
            false && true
            false
         */
        System.out.println("lRes1 = " + lRes1);

        double Var1=15.6;
        double Var2=16.7;
        double Var3=20;
        double Var4=53.5;
        double Var5=55;
        boolean reSult = (Var1 == Var3+Var2) || Var4 >= Var5;
        System.out.println(reSult);

        int case1 = 50;
        int case2 = 20;
        double case3 = 25.6;
        double case4 = 40.3;
        int case5 = 30;
        boolean reSult1 = case1 >= case5+case2 && case3 == case4 || case4 > case5;
        System.out.println(reSult1);

    }
}
