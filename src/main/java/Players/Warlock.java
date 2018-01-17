package Players;

import java.util.ArrayList;

public class Warlock extends Player {
    private Warlock warlock;
    private String spell;
    private String creature;

    public Warlock(String name,String spell, String creature){
        super(name);
        this.spell = spell;
        this.creature = creature;

    }

    public String getSpell() {
        return this.spell;
    }

    public String getCreature() {
        return this.creature;
    }
}
