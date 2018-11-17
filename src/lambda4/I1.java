package lambda4;

@FunctionalInterface  // annotation meta-data
public interface I1 {
    void m1();
   // void m2();
    default void def(){}
    static void st(){}
    default void def2(){}
    static void st2(){}
}
