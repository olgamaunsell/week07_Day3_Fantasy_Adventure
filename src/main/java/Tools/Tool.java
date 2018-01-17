package Tools;

public abstract class Tool {
    private Tool tool;

    private String name;
    private int healthPoints;

    public Tool(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }


}
