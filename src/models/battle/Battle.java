package models.battle;

import models.character.Enemy;
import models.character.Player;
import models.character.Character;

public class Battle {
    private boolean battleWon = false;
    private boolean battleActive = false;
    private int turn;
    private Player player;
    private Enemy enemy;

    public Battle(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void Attack(Character attacker, Character defender){
        defender.setHealthPoints(defender.getHealthPoints() - attacker.getAttackDamage());
        //"Oh no! He did " + attacker.getAttackDamage();
    }

    public boolean isBattleWon() {
        return battleWon;
    }

    public void setBattleWon(boolean battleWon) {
        this.battleWon = battleWon;
    }

    public boolean isBattleActive() {
        return battleActive;
    }

    public void setBattleActive(boolean battleActive) {
        this.battleActive = battleActive;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
}
