package strings;

import java.util.ArrayList;

public class Handler {
    public static void main(String[] args) {
        String s1 = "Serg";
        String s2 = "Serg";  // pool
        String s3 = new String("Serg");
        String s4 = new String("Serg");
//        System.out.println(s1 == s2);    // true (false?)
//        System.out.println(s1 == s4);    // false
//        System.out.println(s3 == s4);    // false
        String s5 = "Mary";
        String s6 = s5;
        s5 += "Ann";
        System.out.println(s5);  //MaryAnn
        System.out.println(s6);  //Mary (MaryAnn?)


        ArrayList<String> as = new ArrayList<>();

    }
}

//immutable