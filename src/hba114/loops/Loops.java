package hba114.loops;

public class Loops {
    public static void main(String[] args) {
        // * For Loop

        // creates an int i variable and assigns 1 to it, until value of i variable is
        // not smaller than 10 increase i by 1
        for (int i = 1; i < 10; i++) {
            // 10 is not included
            System.out.println(i);
        }

        // i++ increases by 1, i += 2 and i = i + 2 increase by 2 and so on...
        // i-- decreases by 1, i -= 2 and i = i - 2 decreases by 2 and so on...

        System.out.print("For Loop is ended.\n\n");

        // creates an int i variable and assigns 1 to it, until value of i variable is
        // not smaller than 10 and not equal to 10 increase i by 1
        for (int i = 1; i <= 10; i++) {
            // 10 is included
            System.out.println(i);
        }

        System.out.print("For Loop is ended.\n\n");

        // * While Loop

        // assign a value to variable for count.
        int i = 2;

        // while i is smaller than 10 or equal to 10 do:
        while (i <= 10) {

            System.out.println(i);
            // this is must to do. if you forget to write this line the loop becomes endless
            i += 2;
            // i++ increases by 1, i = i + 2 increase by 2, i-- decreases by 1, i -= 2 and i
            // = i - 2 decreases by 2
        }

        System.out.print("While Loop is ended.\n\n");

        // * Do-While Loop

        // Do While loop firstly executes do brackets inside than controls statement in
        // while. if statement is true returns to do and executes again and so on...
        do {
            System.out.println(i);
            i--;
        } while (i > 0);

        System.out.print("Do-While Loop is ended.\n\n");

        int j = 100;

        do {
            System.out.println("Logged");
            System.out.println(j);
            j += 2;
        } while (j < 10);

        System.out.print("Do-While Loop is ended.\n\n");
    }
}
