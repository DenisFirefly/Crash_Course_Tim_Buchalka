package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

//        double a = 12 * 3 / 4.0;
//        double b = (12 * 3) / 4.0;
//        double c = 12 * (3 / 4.0);
//        System.out.printf("%s %s %s %n", a, b, c);
//        System.out.println();
//
//        double d = 12.0 / 3.0 / 4.0;
//        double e = (12.0 / 3.0) / 4.0;
//        double f = 12.0 / (3.0 / 4.0);
//        System.out.printf("%s %s %s %n", d, e, f);
//        System.out.println();
//
//        int x = 12 + 3 * 4;
//        int y = (12 + 3) * 4;
//        int z = 12 + (3 * 4);
//        System.out.printf("%s %s %s %n", x, y, z);

//        int x = 12;
//        int y = 6;
//
//        if (x % y == 0) {
//            System.out.printf("%s divides exactly into %s%n", x, y);
//        } else {
//            System.out.printf("%s does not divides exactly into %s%n", x, y);
//        }
//
//       for (int month = 1; month <=12; month++) {
//           System.out.printf("The next month after %s is %s%n", month, month %12 + 1);

//        int a = 12;
//        int b = 0;
////
////        if (b != 0) {
////            int c = divideTwoNumbers(a, b);
////
////            if (c == 2) {
////                System.out.println("WE have found a 2.");
////            }
////        }
//        if ( b != 0 && divideTwoNumbers(a, b) == 2) {
//            System.out.println("We have found a 2.");
//        }
//
//        if (b == 0 || divideTwoNumbers(a, b) == 2) {
//            System.out.println("We have found a 2.");
//        }
//       }
//    private static int divideTwoNumbers(int x, int y) {
//        return x / y;

        int x = 12;
        x += 34;
        System.out.println(x);

        int y = 12;
        y = y * 34;
        System.out.println(y);

        int z = y -= 8;
        System.out.printf("y is %S, z is %s %n", y, z);
        System.out.println("Don't do this");
    }
}