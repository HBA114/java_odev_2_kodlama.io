package hba114.isPrime;

public class IsPrime {
    public static void main(String[] args) {
        int number = 5;

        int remainder = number % 2;

        System.out.println(remainder);

        boolean isPrime = true;

        if (number == 1)
            isPrime = false;
        if (number < 1) {
            System.out.println("Number not valid.");
            isPrime = false;
        }

        for (int i = 2; i < number; i++) {
            if (number == 2) {
                isPrime = true;
                break;
            }
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println("Number : " + number + " is prime.");
        else
            System.out.println("Number : " + number + " is not prime.");
    }
}
