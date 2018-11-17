package lambda3;

public interface I1 {
    void m1();
    default void m2() {   // not abstract
        System.out.println("2");
    };
}
