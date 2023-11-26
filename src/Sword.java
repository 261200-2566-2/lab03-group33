public class Sword {

    private String type;
    public int level;
    public int baseDamage;

    public Sword(String type, int level) {
        this.type = type;
        this.level = level;
        this.baseDamage = 10 + level;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getDamage() {
        return (int) (baseDamage * (1 + 0.1 * level));
    }
}