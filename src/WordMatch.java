public class WordMatch {

    private String secret;

    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
    int score = 0;
        return score;
    }

    public String findBetterGuess(String guess1, String guess2) {
        if (scoreGuess("guess1") > scoreGuess("guess2")) {
            return "guess1";
        } else if (scoreGuess("guess1") < scoreGuess("guess2"))
            return "guess2";
        return "equal";
    }
}

