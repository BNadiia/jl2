package lambda2;

public interface I1 {
    void m1();              // public abstract
    static void m2(){       //not abstract
        System.out.println("2");
    };
}
