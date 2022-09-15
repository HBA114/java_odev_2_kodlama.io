package hba114.switchStatement;

public class SwitchStatement {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Awesome, You passed the exam");
                break;
            case 'B':
                System.out.println("Very Vood, You passed the exam");
                break;
            case 'C':
                System.out.println("Good, You passed the exam");
                break;
            case 'D':
                System.out.println("Not Bad, You passed the exam");
                break;
            case 'F':
                System.out.println("Sorry, You failed exam");
                break;
            default:
                System.out.println("Grade is not valid! Please give a valid grade.");
                break;
        }
    }
}
