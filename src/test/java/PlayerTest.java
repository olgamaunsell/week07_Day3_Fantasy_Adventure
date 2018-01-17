import Players.Cleric;
import Players.Enemy;
import Players.Dwarve;
import Players.Player;
import Players.Warlock;
import Tools.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Dwarve dwarve;
    Warlock warlock;
    Cleric cleric;
    Enemy enemy;
    Weapon weapon;


    @Before

    public void before(){
        weapon = new Weapon("Axe", -20);
        dwarve = new Dwarve("Joe", weapon);
        warlock = new Warlock("Jim", "Fireball", "Dragon");
        cleric = new Cleric("Jon", "Potion");
        enemy = new Enemy("Big Bad Baddie");
    }

    @Test

    public void canGetDwarveName(){
        assertEquals("Joe", dwarve.getName());
    }

    @Test
    public void canGetClericHealthPoints(){
        assertEquals(100, cleric.getHealthPoints());
    }
    @Test
    public void canGetTreasureCount(){
        assertEquals(0, warlock.getTreasuresCount());
    }

    @Test
    public void canGetDwarveWeapon(){
        assertEquals("Axe", dwarve.getWeapon());
    }

    @Test
    public void canGetWarlockSpell(){
        assertEquals("Fireball", warlock.getSpell());
    }

    @Test
    public void canGetWarlockCreature(){
        assertEquals("Dragon", warlock.getCreature());
    }

    @Test
    public void canGetClericHealingTool(){
        assertEquals("Potion", cleric.getHealingTool());
    }

    @Test
    public void dwarveCanAttack(){
        dwarve.attack(enemy);
        assertEquals(80, enemy.getHealthPoints());
    }

    @Test

    public void canSetEnemyHealthPoints(){
        enemy.setHealthPoints(-20);
        assertEquals(80, enemy.getHealthPoints());
    }

}
