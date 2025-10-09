public class WordMatch {
    private String secret;

    public int scoreGuess(String guess) {

        return 0;
    }

    public WordMatch(String word) {

    }

    public String findBetterGuess(String guess1, String guess2) {
        if (scoreGuess("guess1") > scoreGuess("guess2")) {
            return "guess1";
        } else if (scoreGuess("guess1") < scoreGuess("guess2"))
            return "guess2";
        return "equal";
    }
}

