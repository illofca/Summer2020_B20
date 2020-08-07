package day32_MethodOverloading;
import Library.Util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {

        String firstName = "bAtUr";
        String lastName = "lOfCA";

        String fullName;
        fullName = Util.formatFullName(firstName, lastName);

        System.out.println(fullName);

        String uniques = Util.uniques(fullName.toLowerCase());

        System.out.println(uniques);

        String reversedName = Util.reverse(fullName);

        System.out.println(reversedName);

        System.out.println("============================================");

        int[] a = {200,400,500,200,100,50,40,30,400,60,78};
        int n =2500;
        a = Util.addElement(a,n);
        System.out.println(Arrays.toString(a));

    }

}
