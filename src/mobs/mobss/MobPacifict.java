package mobs.mobss;

import interfaces.Danio;
import mobs.Mob;

public abstract class MobPacifict extends Mob implements Danio {
    public MobPacifict(int health){
        super(health);
    }

    @Override 
    public void recibirDanio(int attack){
        health -= attack;
    }
}
