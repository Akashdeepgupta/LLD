package projects.machine_coding.tic_tac_toe.models;

import projects.machine_coding.tic_tac_toe.service.bot_playing_strategy.BotPlayingStrategyFactory;
import projects.machine_coding.tic_tac_toe.service.bot_playing_strategy.BotPlayingStrategyName;
import projects.machine_coding.tic_tac_toe.service.bot_playing_strategy.LinearBotPlayingStrategy;

public class Bot extends Player {
    BotDifficultyLevel botDifficultyLevel;

    public Bot(int id, char symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, "BOT", symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }


    @Override
    public Move makeMove(Board board) {
        return BotPlayingStrategyFactory.getBotPlayingStrategy(BotPlayingStrategyName.LINEARBOTPLAYINGSTRATEGY).makeMove(board,this);
    }
}
