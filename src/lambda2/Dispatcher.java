package lambda2;

public class Dispatcher {
    public static void main(String[] args) {
        I1 t1 = new Test();
        t1.m1();   //3
//        t1.m2();
        Test t2 = new Test();
        t2.m2();
//        Test.m2();
    }

}
//Статичні методи інтерфейса не наслідуються і не перевизначаються.