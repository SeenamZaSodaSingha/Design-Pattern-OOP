public class GameStrategy {
    private Game game;
    public GameStrategy(Game game) {
        this.game = game;
    }

    public void initializeGame() {
        game.initializeGame();
    }

    public void playingGame() {
        game.playingGame();
    }

    public void showResult() {
        game.showResult();
    }
}
