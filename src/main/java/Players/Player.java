package Players;

import java.util.ArrayList;

public abstract class Player {

    private Player player;

    private String name;
    private ArrayList<String> treasures;
    private int healthPoints;

    public Player(String name){
        this.name = name;
        this.healthPoints = 100;
        this.treasures = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public int getTreasuresCount() {
        return this.treasures.size();
    }
}
