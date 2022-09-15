package hba114.Letters;

// Bold and Thin Letters
public class Letters {
    public static void main(String[] args) {
        char letter = 'A';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Bold vowel letter"); // vowel is 'ünlü-sesli harf' in Turkish, opposite of vowel:
                                                         // consonant is 'ünsüz-sessiz harf' in Turkish
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Thin vowel letter");
                break;
            default:
                System.out.println("Consonant letter");
                break;
        }
    }
}
