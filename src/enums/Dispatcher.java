package enums;

public class Dispatcher {
    public static void main(String[] args) {
        Season[] s = Season.values();
        for (Season temp : s) {
           temp.resort();
        }
    }
}

//enumeration enum
