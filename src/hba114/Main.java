package hba114;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // Function 1 include first 6 lessons in youtube. For see result uncomment line
        // below
        // Function1();

        // DataTypes function includes 7th lesson in youtube. For see result uncomment
        // line
        // DataTypes();

        // Conditionals function includes 8th lesson in youtube. For see result
        // uncomment line
        // Conditionals();

        // RecapDemo functions include 9th lesson in youtube. For see result uncomment
        // line below
        // RecapDemo();

        // SwichStatement function includes 10th lesson in youtube. For see result
        // uncomment line below
        // SwitchStatement();

        // Loops function includes 11th, 12th and 13th lessons in youtube. For see
        // result uncomment line below
        // Loops();

        // Arrays function includes 14th lessons in youtube. For see result uncomment
        // line below
        // Arrays();

        // RecapDemo2 function includes 15th lesson in youtube. For see result uncomment
        // line below
        RecapDemo2();

    }

    // Function 1 include first 6 lessons in youtube
    public static void Function1() {
        System.out.println("Hello Java");
        System.out.println("Hello Java 2");

        System.out.println();

        System.out.println("My students count is : 9");
        System.out.println("My students count is : 9");
        System.out.println("My students count is : 9");
        System.out.println("My students count is : 9");

        System.out.println();
        // if another students comes tolesson we have to change the old count in all
        // places we used that number.
        System.out.println("My students count is : 10");
        System.out.println("My students count is : 10");
        System.out.println("My students count is : 10");
        System.out.println("My students count is : 10");

        System.out.println();

        // if you update studentCount and studentCountSentence and assign to these
        // varibales like below, everywhere
        // in you use those variables, values will change

        int studentCount = 15;
        String studentCountSentence = "My students count is : ";

        System.out.println("Student Count Variable Value is : " + studentCount);
        System.out.println("Student count sentence is : " + studentCountSentence);

        System.out.println("Change these variables values and see what happens to MyStudent Count sentences below.");
        System.out.println();

        System.out.println(studentCountSentence + studentCount);
        System.out.println(studentCountSentence + studentCount);
        System.out.println(studentCountSentence + studentCount);
        System.out.println(studentCountSentence + studentCount);
    }

    // DataTypes function includes 7th lesson in youtube.
    public static void DataTypes() {
        int number = 12;
        // number = "Ankara"; //! Gives Type Mismatch error.
        number = 14;

        number = 13111111;
        // * int number has a range between -2147483648 and 2147483647 (32 bits = 4
        // bytes)

        byte byteNumber = 12;

        // byteNumber = 13111111;
        // ! Gives Type Mismatch error. Because the given
        // ! number can not assign to 16
        // ! bit variable in address
        // * Byte has a range between -128 and 127 (16 bits = 2 bytes)

        // byte, short, long and int accepts decimals

        // double, float accepts floating-point numbers

        // boolean accepts 2 values : True or False

        // char accepts characters
        // String accepts multi character (array of chars)

        double doubleNumber = 12.5;
        // * double uses 8 bytes (64 bits) of memory.
        // * And the memory size effects size of numbers

        // * Use f in the end of floating-point number to assign it to float type
        // * variable
        float floatNumber = 14.2f;
        // * float uses 4 bytes (16 bits) of memory

        // When assigning a character to char variable you have to use single quotes.
        // If you use double quotes it will see that as string(char array) and gives
        // Type Mismatch error.
        char character = 'A';

        String string = "Ankara";

        boolean isLessonEnds = false;

        if (isLessonEnds) { // You can write isLessonEnds == true but you dont have to write it all
            System.out.println("Commit files and submit homework to Kodlama.io");
        } else {
            System.out.println("Lesson not ended yet.");
        }
    }

    // Conditionals function includes 8th lesson in youtube.
    public static void Conditionals() {
        int number = 20;
        if (number < 20) {
            System.out.println("Number is smaller than 20");
        } else if (number > 20) {
            System.out.println("Number is greater than 20");
        } else {
            System.out.println("Number is equal to 20");
        }
    }

    // RecapDemo function includes 9th lesson in youtube.
    public static void RecapDemo() {
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

    // SwichStatement function includes 10th lesson in youtube.
    public static void SwitchStatement() {

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

    // Loops function includes 11th, 12th and 13th lessons in youtube.
    public static void Loops() {

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

    // Arrays function includes 14th lesson in youtube.
    public static void Arrays() {

        // if we assign variables seperately we have to write them separetely
        String student1 = "Hasan Basri Ayhaner";
        String student2 = "Engin";
        String student3 = "Derin";
        // and if we add another variable
        String student4 = "Salih";

        // if we assign variables seperately we have to write them separetely
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        // if another variable assigned to ne wvariable we need to add new
        // System.out.println() every time we add ne variable
        System.out.println(student4);

        // but we can use arrays of variables like :

        // This method creates an array size of 4. That size can't extend after.
        String[] studentArray = new String[4];
        studentArray[0] = "Hasan Basri Ayhaner";
        studentArray[1] = student2;
        studentArray[2] = "Derin";
        studentArray[3] = student4;
        // studentArray[4] = "Ahmet";
        // Assignment of 5th element will cause to ArrayIndexOutOfBoundsException error.

        for (int i = 0; i < studentArray.length; i++) {
            System.out.println(i + 1 + ". Student : " + studentArray[i]);
        }

        System.out.println();

        // we can assign as direct string or string variable
        // This method creates an array size of 4. That size can't extend after.
        String[] students = {
                "Hasan Basri Ayhaner",
                student2,
                "Derin",
                student4
        };

        // students[4] = "Ahmet";
        // Assignment of 5th element will cause to ArrayIndexOutOfBoundsException error.

        // this for loop known as foreach loop
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println();

        // With List and ArrayList from java.util we can create dynamic(unbounded)
        // arrays.
        List<String> studentList = new ArrayList<String>();

        studentList.add("Hasan Basri Ayhaner");

        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add("Ahmet");
        studentList.add("Mehmet");

        for (String student : studentList) {
            System.out.println(student);
        }
    }

    // RecapDemo2 function includes 15th lesson in youtube.
    public static void RecapDemo2() {
        double[] myList = { 1.2, 1.3, 4.3, 5.6 };
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number)
                max = number;
            total += number;
            System.out.println(number);
        }

        System.out.println("Total = " + total);
        System.out.println("Max = " + max);
    }
}