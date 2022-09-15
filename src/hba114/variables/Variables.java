package hba114.variables;

public class Variables {
    public static void main(String[] args) throws Exception {

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

        // * Maximum simultaneous views of first lesson in Java 2022 Camp
        int studentCount = 4228;
        String studentCountSentence = "Engin Demiroğ's students count is : ";

        System.out.println("Student Count Variable Value is : " + studentCount);
        System.out.println("Student count sentence is : '" + studentCountSentence + "'");

        System.out.println("Change these variables values and see what happens to MyStudent Count sentences below.");
        System.out.println();

        System.out.println(studentCountSentence + studentCount);
        System.out.println(studentCountSentence + studentCount);
        System.out.println(studentCountSentence + studentCount);
        System.out.println(studentCountSentence + studentCount);

    }
}
