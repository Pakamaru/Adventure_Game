package ui;

import game.GameState;

public interface UI {
    void setMessage(String message);

    void setErrorMessage(String message);

    void refresh(GameState gameState);

    String refreshAndGetInput(GameState gameState, String input);
}
