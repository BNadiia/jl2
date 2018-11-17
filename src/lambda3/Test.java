package lambda3;

public class Test extends Parent implements I2 {
    public void m1() {}

    public void m2() {
     //   super.m2();
        I2.super.m2();
        System.out.println("3");
    }
}
