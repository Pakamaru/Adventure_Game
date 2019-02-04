package models.character;

public class Enemy extends Character{
    public int carryingExperience;

    public Enemy(int characterLevel, int attackDamage, int healthPoints, int currentExperienc, String name) {
        super(characterLevel, attackDamage, healthPoints, name);
        this.carryingExperience = carryingExperience;
    }

    public int getCarryingExperience() {
        return carryingExperience;
    }
}