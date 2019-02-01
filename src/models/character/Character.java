package models.character;

public class Character {
    public int characterLevel;
    public int attackDamage;
    public int healthPoints;

    public Character(int characterLevel, int attackDamage, int healthPoints){
        this.characterLevel = characterLevel;
        this.attackDamage = attackDamage;
        this.healthPoints = healthPoints;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
}
