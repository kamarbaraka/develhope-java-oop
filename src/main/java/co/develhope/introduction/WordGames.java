package co.develhope.introduction;

/**
 * a simple program to demonstrate classes
 * @author kamar baraka
 * @version 1.0*/

public class WordGames {

    /**
     * print hello and the word passed
     * @param word the word to concatenate with Hello
     * @return string containing the concatenated strings
     * */
    public String addHelloWord(String word){
        return "Hello %s ".formatted(word);
    }

    /**
     * get the full name of an object
     * @param name the first name.
     * @param surname the surname
     * @return concatenated string of name and surname
     * */
    public String getFullName(String name, String surname){
        return "%s %s ".formatted(name, surname);
    }
}

/**
 * a class to test the WordGame class
 * */
class Tester{

    public static void main(String... args){

        var game = new WordGames();

        System.out.println(game.addHelloWord("kamar"));
        System.out.println(game.getFullName("kamar", "baraka"));
    }
}
