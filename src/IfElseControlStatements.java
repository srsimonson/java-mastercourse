public class IfElseControlStatements {
 
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if( score == 5000 ) System.out.println("Your score was 5000!");
        // can skip curly braces if one line. bad practice though.

        if ( score < 5000 && score > 1000 ) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("your score was less than 1000");
        } else {
            System.out.println(" got here ");
        }
            System.out.println("This line is also executed.");
        // }

        if (gameOver == true) { // also if (gameOver) works
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }

        boolean bonusGameOver = true;
        int testScore = 10000;
        int testLevelCompleted = 8;
        int testBonus = 200;
        // to save memory, you could resuse variables and make them have new values.

        if ( bonusGameOver ) {
            int finalScore = testScore + (testLevelCompleted * testBonus );
            System.out.println("TFS: " + finalScore);
        }

    }
}

    