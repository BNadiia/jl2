package blinov1;

import java.util.Arrays;

public class Handler {
    public static void main(String[] args) {
        String[] s = {"Serg", "Mary", "Ann", "Max", "Bohdan"};
        //3->"A" SerA, MarA, Ann, Max, BohAan
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            if(s[i].length() > 3){
                sb = new StringBuilder(s[i]);
                sb.setCharAt(3, 'A');
                s[i] = sb.toString();
            }
        }
        System.out.println(Arrays.toString(s));
    }
}
