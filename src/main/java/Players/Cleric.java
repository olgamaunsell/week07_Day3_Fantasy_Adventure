package Players;

public class Cleric extends Player {
    private Cleric cleric;
    private String healingTool;

    public Cleric(String name, String healingTool){
        super(name);
        this.healingTool = healingTool;

    }

    public String getHealingTool() {
        return this.healingTool;
    }
}
