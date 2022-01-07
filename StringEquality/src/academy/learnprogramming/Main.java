package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        String first = "This is a String";
        String second = "THIS IS A STRING";

        System.out.println(first == second);
        System.out.println(second == first);
        System.out.println("Never do the upper one for Strings!");
        System.out.println(first.equalsIgnoreCase(second));
        System.out.println(second.equalsIgnoreCase(first));
    }
}
