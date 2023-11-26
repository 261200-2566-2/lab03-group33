public class Shield{

    private String type;
    public int level;
    public int baseDefense;

    public Shield(String type, int level) {
        this.type = type;
        this.level = level;
        this.baseDefense = 5 + level;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getDefense() {
        return (int) (baseDefense * (1 + 0.05 * level));
    }

}
