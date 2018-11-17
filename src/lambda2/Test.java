package lambda2;

public class Test implements I1 {
    @Override
    public void m1() {
        System.out.println("3");
    }

    void m2(){             //not override
        System.out.println("4");
    }
}
