import java.io.FileNotFoundException;
import java.io.File;
import java.nio.channels.WritePendingException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(read());
    }
//        WordMatch w = new WordMatch("mississippi");
//        System.out.println(w.scoreGuess("i"));
//        System.out.println(w.scoreGuess("iss"));
//        System.out.println(w.scoreGuess("issipp"));
//        System.out.println(w.scoreGuess("mississippi"));
//        System.out.println("NEW WORD");
//        WordMatch game = new WordMatch("concatenation");
//        System.out.println(game.scoreGuess("ten"));
//        System.out.println(game.scoreGuess("nation"));
//        System.out.println(game.findBetterGuess("ten", "nation"));
//        System.out.println(game.scoreGuess("con"));
//        System.out.println(game.scoreGuess("cat"));
//        System.out.println(game.findBetterGuess("con", "cat"));

    public static String read() throws FileNotFoundException {
        File f = new File("Guesses.txt");
        Scanner s = new Scanner(f);
        int index = 0;
        int counter = 0;
        while (s.hasNext()) {
            String a = "placeholder1";
            String b = "placeholder2";
            String c = "placeholder3";
            a = (s.next());
            b = (s.next());
            c = (s.next());
            WordMatch w = new WordMatch(a);
            System.out.println(w.findBetterGuessValue(a, c));
            
        }
        return "WIP";
    }
}