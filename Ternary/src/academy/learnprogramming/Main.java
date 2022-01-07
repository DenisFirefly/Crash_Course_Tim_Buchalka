package academy.learnprogramming;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What day is it?");
        String day = scanner.nextLine();
        String howToSpendTime;

//        if (day.toLowerCase().equals("saturday") && day.toLowerCase().equals("sunday")) {
//            howToSpendTime = "Relax";
//        } else {
//            howToSpendTime = "Study";
//        }

        howToSpendTime = day.toLowerCase().equals("sunday") ? "Relax" : "Work";

        System.out.printf("%s on %s %n", howToSpendTime, day);
        scanner.close();
    }
}
