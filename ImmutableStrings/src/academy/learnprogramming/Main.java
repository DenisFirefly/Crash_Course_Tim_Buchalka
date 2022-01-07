package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//	    int x = 5;
//        int y = x;
//        System.out.printf("x i %d, y = %d %n", x, y);
//        System.out.printf("x is the same as y: %s %n", x == y);



        StringBuilder first = new StringBuilder("This is a String");

        int a = 12;
        int b = 34;
        int c = 46;

        first.append(String.valueOf(' '));
        first.append(String.valueOf(a));
        first.append(String.valueOf(' '));
        first.append(String.valueOf(3.45));
        first.append(String.valueOf(' '));
        first.append(String.valueOf(a == 12));
        first.append(String.valueOf(' '));
        first.append(String.valueOf(b > c));
        first.append(String.valueOf(' '));
        first.append("Java is great".toString(), 8, 13);

        System.out.println(first);


    }
}
