package Players;

import Rooms.Enemy;
import Tools.Weapon;

public class Dwarve extends Player implements ICollect, IAttack{

    private Dwarve dwarve;
    private Weapon weapon;
    private Enemy enemy;

    public Dwarve(String name, Weapon weapon){
        super(name);
        this.weapon = weapon;

    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public int attack(Enemy enemy){
        if (enemy.getHealthPoints() > 0){
            int weaponHealthPoints = this.weapon.getHealthPoints();
            enemy.setHealthPoints(weaponHealthPoints);
            return enemy.getHealthPoints();}
        else {
            return enemy.getHealthPoints();
        }
    }


    public String collect(){
        return "Dwarve collect";
    }
}
