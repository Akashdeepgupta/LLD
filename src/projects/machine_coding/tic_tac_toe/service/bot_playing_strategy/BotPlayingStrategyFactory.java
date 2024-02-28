package projects.machine_coding.tic_tac_toe.service.bot_playing_strategy;

import projects.machine_coding.tic_tac_toe.exception_handling.InvalidBotPlayingStrategy;
import projects.machine_coding.tic_tac_toe.models.Player;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotPlayingStrategyName botPlayingStrategyName){
        switch (botPlayingStrategyName){
            case LINEARBOTPLAYINGSTRATEGY -> {
                return new LinearBotPlayingStrategy();
            }
            default -> throw new InvalidBotPlayingStrategy("this bot playing does not exist");
        }
    }
}
