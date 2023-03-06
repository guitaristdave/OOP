package selfEd.RPG;
public abstract class BaseHero {
    private static int counter;
    private int id;
    private String nickname;
    private double hp;
    private double maxHp;
    private double defence;
    private int damage;

    public BaseHero(String nickname, double hp, double defence, int damage) {
        this.id = ++counter;
        this.nickname = nickname;
        this.hp = hp;
        this.maxHp = hp;
        this.defence = defence;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return String.format("id: %d\nnick: %s\nhp: %.2f", this.id, this.nickname, this.hp);
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public double getHp() {
        return hp;
    }

    public double getMaxHp() {
        return maxHp;
    }

    public double getDefence() {
        return defence;
    }

    public int getDamage() {
        return damage;
    }

    private boolean isAlive() {
        if (this.hp <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void toAttack(BaseHero target) {
        if (target.isAlive() && this.id != target.id) {
            java.util.Random rand = new java.util.Random();
            target.hp -= rand.nextInt(this.damage - 50, this.damage + 50) * (1 - target.defence);
        }
    }

    public static void duel(BaseHero target1, BaseHero target2) {
        while(target1.isAlive() || target2.isAlive()) {
            target1.toAttack(target2);
            if (!target2.isAlive()) {
                System.out.println(target2.getNickname() + " dead");
                break;
            }
            target2.toAttack(target1);
            if (!target1.isAlive()) {
                System.out.println(target1.getNickname() + " dead");
                break;
            }
        }
    }
}
