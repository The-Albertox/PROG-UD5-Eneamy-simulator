package player;

import interfaces.Combate;

public class Player implements Combate {
    protected int health;
    protected int defense;
    protected int strength;

    public Player( int defense, int strength) {
        this.health = 12;
        this.defense = defense;
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    @Override
    public int attack(){
        return strength ;
    }

    @Override
    public void recibirDanio(int attack){
        int Danio = attack - defense;
        health -= Danio;
        System.out.println("your character has received" + Danio + " points of damage, its health now is " + health );
    }
}
