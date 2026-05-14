

public class Warrior extends Character {
    protected boolean shielded = false;

    public Warrior(String name) {
        super(name); // Эцэг классын constructor-ийг дуудна
        this.hp = 150;
        this.maxHp = 150;
    }

    public void shieldBash() {
        this.shielded = true;
    }

    @Override
    public void takeDamage(int amount) {
        if (this.shielded) {
            // Бамбайтай үед damage 50% багасна
            super.takeDamage(amount / 2);
            this.shielded = false; // Нэг удаа хамгаалаад бамбай идэвхгүй болно
        } else {
            super.takeDamage(amount);
        }
    }
}