package models.character;

public class Character {
    public int characterLevel;
    public int attackDamage;
    public int healthPoints;
    public String name;

    public Character(int characterLevel, int attackDamage, int healthPoints, String name){
        this.characterLevel = characterLevel;
        this.attackDamage = attackDamage;
        this.healthPoints = healthPoints;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
