package models.character;

public class Player extends Character {
    public int currentExperience;

    public Player(int characterLevel, int attackDamage, int healthPoints, int currentExperience) {
        super(characterLevel, attackDamage, healthPoints);
        this.currentExperience = currentExperience;
    }

    public int getCurrentExperience() {
        return currentExperience;
    }

    public void setCurrentExperience(int currentExperience) {
        this.currentExperience = currentExperience;
    }
}
