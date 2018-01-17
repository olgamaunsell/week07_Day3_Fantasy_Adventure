package Players;

public class Dwarve extends Player {
    private Dwarve dwarve;
    private String weapon;

    public Dwarve(String name, String weapon){
        super(name);
        this.weapon = weapon;

    }

    public String getWeapon() {
        return this.weapon;
    }
}
