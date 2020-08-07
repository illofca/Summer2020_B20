package day17_StringReview;

public class String_Methods {
    /* String methods: charAt, length, upper, lower, trim, substring, replace,
    * replaceFirst, indexOf, lastIndexOf, equals, equalsIgnoreCase, isEmpty,
    * ends, starts, contains*/
    public static void main(String[] args) {
        // charAt(index) ==> char
        String  str = "Cybertek";
        //             01234567

        char ch1 = str.charAt(7);

        System.out.println(ch1);

        // +;
        String str2 = "Cybertek";
               str2 = str2+ " " +"School";
        System.out.println(str2);


        // length()
        String str3 = "Cybertek";
        int l = str3.length();
        System.out.println(l);

        // lastIndex : length-1

       char ch2 = str3.charAt(l-1); //str.length()-1 ==> 15 - 1 = 14
                                       // length is 15, index is 14.
        System.out.println(ch2);

        System.out.println("last index: " + (l-1));


        // upperCase & lowerCase

        String  str4 = "cybertek";
                str4 = str4.toUpperCase(); // "CYBRTEK";

        System.out.println(str4);

        String str5 = "JAVA";
               str5 = str5.toLowerCase(); // "java"

        System.out.println(str5);


        // trim()  ==> removes only unusued spacet at the beginning and end, not middle

        String str6 = "    Cybertek School        ";
        str6 = str6.trim();

        System.out.println(str6);


        // substring: ENDING INDEX IS EXCLUDED, BEGINNING INDEX IS INCLUDED
        // prints the word  when beginning index is given

        String str7 = "I like Java Language";
            //           012345678910

        String word = str7.substring(7,10+1); // "Java"
        System.out.println(str7);
        System.out.println(word);

        String word2 = str7.substring(12, str7.length());
        String word3 = str7.substring(12);// same with above
        System.out.println(word2);
        System.out.println(word3);

        String word4 = str7.substring(2, 5+1);
        System.out.println(word4);

        // indexOf & lastIndexOf ==> int
        String  str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int i1 = str8.indexOf("W");
        System.out.println(i1);

        System.out.println(str8.charAt(i1));

        int i2 = str8.indexOf(", W") + 2;
        int i3 = str8.indexOf("We are happy to see you");
        System.out.println(i2);
        System.out.println(i3);

        String str9 = "Java Java Java";

        int i4 = str9.lastIndexOf("J");
        int i5 = str9.indexOf("J");
        int i6 = str9.indexOf(" Java ") +1;
        int i7 = str9.lastIndexOf("Java ");

        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);

        // replace & replaceFirs
        // all of them & firs one
        /*

        String s1 = "I like Java, Java is a programming language";
        s1 = s1.replace("Java", "C#"); // will return
        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java", "C#");
      //  String s3 = I like Java, Java is a programming language";
        s3 = str3.replace("Java is", "C# is");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
*/







    }
}
