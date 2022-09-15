package hba114.multiDimensionalArrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        // line 0 column 0
        cities[0][0] = "Istanbul";
        // line 0 column 1
        cities[0][1] = "Bursa";
        // line 0 column 2
        cities[0][2] = "Bilecik";

        // line 1 column 0
        cities[1][0] = "Ankara";
        // line 1 column 1
        cities[1][1] = "Konya";
        // line 1 column 2
        cities[1][2] = "Kayseri";

        // line 3 column 0
        cities[2][0] = "Diyarbakır";
        // line 3 column 1
        cities[2][1] = "Şanlıurfa";
        // line 3 column 2
        cities[2][2] = "Gaziantep";

        // First for loop switch between lines,
        for (int i = 0; i < 3; i++) {
            System.out.println("<---------------------------------->");
            // Second for loop switch between columns,
            for (int j = 0; j < 3; j++) {
                System.out.println("Line: " + i + ", Column: " + j + " City: " + cities[i][j]);
            }
            // After every line ends this line of code gives 1 line space
            System.out.println();
        }
    }
}
