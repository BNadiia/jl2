package wrappers;

public class Handler {
    public static void main(String[] args) {
        Integer i1 = new Integer(5);
        Integer i2 = 5;  //autoboxing
        int x = i2;      //autounboxing
        int y = Integer.parseInt("253");
        int z = i2.intValue();
        String s = new String("" + 6);
        //immutable    pool(?)
        Integer x1 = 10;
        Integer x2 = x1;
        x1++;
        System.out.println(x2 + "" + x1);  // 10   11
        //pool
        Integer y1 = 120;
        Integer y2 = 120;
        Integer y3 = 250;
        Integer y4 = 250;
        System.out.println(y1 == y2);
        System.out.println(y3 == y4);
    }
}
//В pool поміщаютьcя Integer wrappers розміром 1 байт

//Тести Блінов Варіант а і б

//float Float
//double Double
//boolean Boolean
//long Long
//byte Byte
//short Short
//int Integer
//char Character
