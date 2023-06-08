package mobs;

public abstract class Mob {
    protected int health;

    public Mob(int health){
        this.health = health;
    }
    public int getHealth(){
        return health;
    }
    public abstract void movement();
}
