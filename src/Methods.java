public class Methods {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, 5, 100);
        calculateScore(false, 10000, 8, 200);

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver == true) { // also if (gameOver) works
            int finalScore = score + (levelCompleted * bonus);

            return finalScore;
            // Could add an if/else if you wanted to. Otherwise this way works too.
        } 
        System.out.println("-1");
        return -1;
        // Why return -1? Conventionally used to indicate an error. Searching algorithms imply -1 means "value not found."
    }
}

// VOID means "don't return anything." Change VOID to INT to return a value to the top method. In Java, you have to return something. It will error if nothing is returned, as in the 1st if statement isn't met. Need the other return.
