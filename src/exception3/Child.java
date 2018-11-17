package exception3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent {
    void m1() throws FileNotFoundException {}
    void m2() throws ArithmeticException {}
    void m3() {}
}
