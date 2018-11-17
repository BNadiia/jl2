package lambda5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Dispatcher {
    public static void main(String[] args) {
        I1 p1 = new Process1();
//        System.out.println(p1.process(5,7));   //add
        I1 p2 = new I1() {   // substruct
            public int process(int a, int b) {
                return a - b;
            }
        };
//        System.out.println(p2.process(5, 2));

        I1 p3 = (a, b) -> {
            return a * b;
        };    //multiply
//        System.out.println(p3.process(4, 6));

/*        I1 p4 = (a, b) -> {return a > b ? a : b;};
//        System.out.println(p4.process(2,9));
*/
        I1 p4 = (a, b) -> Math.max(a, b);
//        System.out.println(p4.process(2,9));


        ////////////////////////////////////////////

        ArrayList<Car> alc = new ArrayList<>();
        alc.add(new Car("BMW", 7000));
        alc.add(new Car("Audi", 5000));
        alc.add(new Car("Ford", 8000));
        alc.add(new Car("Opel", 6000));
        Car find = new Car("", 7200);
        I2<Car> pr1 = (a, c) -> {
            int index = a.indexOf(c);
            return index;
        };
//        System.out.println(pr1.process(alc, find));

        BiFunction<ArrayList<Car>, Car, Object> pr3 = (a, b) -> {
            int c = a.indexOf(b);
            return c;
        };
//        System.out.println(pr3.apply(alc, find));


        I2<Car> pr2 = (a, c) -> {
            NavigableSet<Car> nsc = new TreeSet<>(a);
            return nsc.floor(c);
        };
//        System.out.println(pr2.process(alc, find));

        BiConsumer<Car, Horse> pr4 = (a, b) -> {
            if(a.price > b.price){
                System.out.println(a);
            }else{
                System.out.println(b);}
        };
        Horse myHorse = new Horse("Arabian", 5000);
        pr4.accept(find, myHorse);
        System.out.println();

        BiConsumer<Car, Horse> pr5 = (a, b) -> {
            if(a.price > b.price){
                b.price = a.price;
            }else{
                a.price = b.price;}
        };
        pr5.accept(find, myHorse);
        System.out.println(find + " " + myHorse);

        Predicate<Integer> pr6 = a ->{
            return (a % 2) == 0;
        };
        System.out.println(pr6.test(4));

    }
}
