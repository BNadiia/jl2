package files;

import java.io.*;
import java.util.*;

public class Handler {
    public static void main(String[] args) {
        try {
            fileActions();
        } catch (IOException e) {
            System.out.println("Final Handling");
        }
    }

    static void fileActions() throws IOException{
        File f1 = new File("C:\\Users\\Nadiya Bogoslavets\\IdeaProjects\\javalessonstwo\\src\\files\\file1");
        File f2 = new File("C:\\Users\\Nadiya Bogoslavets\\IdeaProjects\\javalessonstwo\\src\\files\\file2");
//        System.out.println(f1.exists());
//        System.out.println(f1.length());
        ArrayList<String> als = new ArrayList<>();
//        int x =10/0;  //unchecked exception
        try {
            f2.createNewFile();
            BufferedReader br = new BufferedReader(new FileReader(f1));
            PrintWriter pw = new PrintWriter(f2);
            String temp = "";
            while ((temp = br.readLine()) != null){
                als.add(temp);
            }
            System.out.println(als);
            for(String s : als){
                pw.println(s);
            }
            br.close();
            pw.flush();
            pw.close();
        } catch (IOException ioe) {
            System.out.println("Priliminary Handling");
            throw ioe;
        }
    }



}
