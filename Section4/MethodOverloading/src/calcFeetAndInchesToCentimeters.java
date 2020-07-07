public class calcFeetAndInchesToCentimeters {
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored" + score + " points");
        return score*1000;
    }

    public static int calculateScore(String name, int score) {
        System.out.println("player " + name + " has score: "+score + "\n");
        return score*1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
}
