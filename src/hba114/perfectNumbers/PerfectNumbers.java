package hba114.perfectNumbers;

public class PerfectNumbers {
    public static void main(String[] args) {
        // first perfect number is 6, second is 28, ... 8128 are perfect numbers.
        int number = 8128;
        int totalOfProperDivs = 0;

        // A perfect number is a positive integer that is equal to the sum of its
        // positive divisors, excluding the number itself. So number is not included in
        // for loop
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                totalOfProperDivs += i;
            }
        }

        if (totalOfProperDivs == number)
            System.out.println(number + " is a perfect number.");
        else
            System.out.println(number + " is not a perfect number.");
    }
}
