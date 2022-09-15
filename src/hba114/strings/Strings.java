package hba114.strings;

public class Strings {
    public static void main(String[] args) {
        String message = "Today weather is beautiful.";

        System.out.println(message);

        System.out.println("Message element count : " + message.length());

        System.out.println("6th element of message is : " + message.charAt(6));

        // if we not assign to variable the result of concat method ...
        System.out.println(message.concat(" Lets have a picnic in garden."));
        // original message in message variable will not change
        System.out.println(message);

        // we need to assign to variable the result of concat method.
        message = message.concat(" Lets have a picnic in garden.");

        System.out.println(message);

        System.out.println(message.startsWith("A"));

        System.out.println(message.endsWith("."));

        char[] characters = new char[10];
        message.getChars(0, 9, characters, 0);

        System.out.println(characters);

        System.out.println(message.indexOf('g'));

        System.out.println(message.indexOf("picnic"));

        System.out.println(message.indexOf("e"));

        System.out.println(message.lastIndexOf("e"));

        // if we not assign to variable the result of replace method ...
        System.out.println(message.replace("garden", "park"));
        // original message in message variable will not change
        System.out.println(message);

        String newMessage = message.replace("garden", "park");

        System.out.println(newMessage);

        System.out.println(message.substring(2, 10));

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());

        System.out.println(message.toUpperCase());
    }
}
