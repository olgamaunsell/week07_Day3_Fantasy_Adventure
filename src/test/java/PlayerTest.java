import Players.Cleric;
import Players.Dwarve;
import Players.Player;
import Players.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Dwarve dwarve;
    Warlock warlock;
    Cleric cleric;


    @Before

    public void before(){
        dwarve = new Dwarve("Joe", "Axe");
        warlock = new Warlock("Jim", "Fireball", "Dragon");
        cleric = new Cleric("Jon", "Potion");

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

}
