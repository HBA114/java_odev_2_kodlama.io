package hba114.datatypes;

public class DataTypes {
    public static void main(String[] args) {
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
}
