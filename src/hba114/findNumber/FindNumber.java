package hba114.findNumber;

public class FindNumber {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        int searchFor = 6;
        boolean isIncluded = false;

        for (int number : numbers) {
            if (number == searchFor) {
                isIncluded = true;
                break;
            }
        }

        if (isIncluded)
            System.out.println(searchFor + " is included in numbers.");
        else
            System.out.println(searchFor + " is not included in numbers.");
    }
}
