package hba114.recapDemo;

public class RecapDemo {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 25;
        int number3 = 2;

        // assign number1 to greater variable
        int greater = number1;

        // if greater number is smaller than number2 assign number2 to greater variable
        if (greater < number2) {
            greater = number2;
        }

        // if greater number is smaller than number3 assign number3 to greater variable
        if (greater < number3) {
            greater = number3;
        }

        System.out.println("Greater number is : " + greater);
    }
}
