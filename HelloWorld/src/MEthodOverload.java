public class MEthodOverload {
    public static void main(String[] args){
        int newScore = calculateScore("Tim", 500);
        calculateScore(75);
        calculateScore("Jose", 100);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player nane, no player score");
        return 0;
    }
}
