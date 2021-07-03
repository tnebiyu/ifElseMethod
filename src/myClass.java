public class myClass {
    public static void main(String[] args) {


        boolean gameOver = true;

        calculatScore(true, 800, 5, 100);
        calculatScore(true, 1000, 8, 200);

    }

    public static void calculatScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final scre was " + finalScore);
        }
    }
}