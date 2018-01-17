package Players;

public class Cleric extends Player implements ICollect {
    private Cleric cleric;
    private String healingTool;

    public Cleric(String name, String healingTool){
        super(name);
        this.healingTool = healingTool;

    }

    public String getHealingTool() {
        return this.healingTool;
    }

    public String collect(){
        return "Cleric collect";
    }
}
