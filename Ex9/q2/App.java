public class App {
    public static void main(String[] args) {
        GameStrategy game = new GameStrategy(new Football());
        game.initializeGame();
        game.playingGame();
        game.showResult();

        game = new GameStrategy(new Basketball());
        game.initializeGame();
        game.playingGame();
        game.showResult();
    }
}
