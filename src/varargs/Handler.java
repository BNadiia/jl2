package varargs;

import java.util.Arrays;

public class Handler {
    public static void main(String[] args) {
        int[] x = {5, 2, 8, 4};
        //      increments(x);
        displayVA(6, 8, 4, 5, 2);
        va1("Serg", 5);
      //  va1("Serg");
      //  va2(5);
    }

    static void va1(String s, int... x) {}
    // void va2(int... x, String s) {}
    static void va1(String s, boolean... b){}
    static void va2(int a, int... b){}
    static void va2(int... b){}

    static void displayVA(int... x) {
        for (int i = 0; i < x.length; i++) {
            x[i]++;
        }
        System.out.println(Arrays.toString(x));
    }

    static void increments(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i]++;
        }
        System.out.println(Arrays.toString(x));
    }

}
// variable length arguments

//При виклику метода, де переданий параметр має перетворюватися, припустиме тільки одноразове перетворення;
//                                                              поліморфне перетвонення не є перетворення.