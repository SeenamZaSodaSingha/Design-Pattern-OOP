public class App {
    public static void main(String[] args) {
        Game football = new Football();
        football.initializeGame();
        football.playingGame();
        football.showResult();
        Game basketball = new Basketball();
        basketball.initializeGame();
        basketball.playingGame();
        basketball.showResult();
    }
}
