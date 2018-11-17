package exception4;

import java.io.*;

public class Handler {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
//            int x = 10 / 0;
//        }catch(Exception e ){
//            //actions may throws new other Exception
//            System.out.println("Exception");
//            int y = 5/0;
        }finally {
            System.out.println("Finally");
        }
        System.out.println("End");
    }
}

//Блок try finally використовується, коли ми хочемо обробити помилку "вгорі", але потрібно виконати якісь фінальні дії