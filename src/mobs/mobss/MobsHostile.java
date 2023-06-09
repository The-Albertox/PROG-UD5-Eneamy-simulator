package mobs.mobss;

import interfaces.Combate;
import mobs.Mob;

public abstract class MobsHostile extends Mob implements Combate {
    public int strength;
    public MobsHostile(int health ,int strength){
        super(health);
        this.strength = strength;
    }

    @Override
    public void movement(){

    }
    @Override
    public int attack(){
        return strength;
    }

    @Override
    public void recibirDanio(int attack){
        int damage = attack;
        health -= damage;
        System.out.println("the enemy has take " + damage + "points of damage its health is" + health );
    }
}
