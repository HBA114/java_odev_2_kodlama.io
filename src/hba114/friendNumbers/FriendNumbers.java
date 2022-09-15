package hba114.friendNumbers;

public class FriendNumbers {
    public static void main(String[] args) {
        int number1 = 6232, number2 = 6368;
        int sumOfDivs1 = 0, sumOfDivs2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                sumOfDivs1 += i;
            }
        }

        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                sumOfDivs2 += i;
            }
        }

        if (sumOfDivs1 == number2 && sumOfDivs2 == number1)
            System.out.println(number1 + " and " + number2 + " are friendly numbers.");
        else
            System.out.println(number1 + " and " + number2 + " are not friendly numbers.");
    }
}
