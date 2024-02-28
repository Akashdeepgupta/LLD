package projects.machine_coding.tic_tac_toe.service.winning_strategy;

import projects.machine_coding.tic_tac_toe.exception_handling.InvalidWinningStrategy;

public class WinningStrategyFactory {
    public static WinningStrategy getWinningStrategy(WinningStrategyName winningStrategyName, int dimension){
        switch (winningStrategyName){
            case ORDERONEWINNINGSTRATEGY -> {
                return new OrderOneWinningStrategy(dimension);
            }
            default -> {
                throw new InvalidWinningStrategy("This Winning strategy does not exist");
            }
        }
    }
}
