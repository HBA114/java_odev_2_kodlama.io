package hba114.arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
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
}
