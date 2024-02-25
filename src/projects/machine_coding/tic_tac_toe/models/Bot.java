package projects.machine_coding.tic_tac_toe.models;

public class Bot extends Player {
    BotDifficultyLevel botDifficultyLevel;

    public Bot(int id, char symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, "BOT", symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Bot(int id, String name, char symbol, PlayerType playerType) {
        super(id, name, symbol, playerType);
    }

    @Override
    public Move makeMove(Board board) {
        return null;
    }
}
