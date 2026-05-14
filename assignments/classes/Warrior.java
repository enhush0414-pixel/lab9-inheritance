

public class Warrior extends Character {
    protected boolean shielded = false;

    public Warrior(String name) {
        super(name); // Эцэг классын constructor-ийг заавал түрүүлж дуудна
        this.hp = 150;
        this.maxHp = 150;
    }

    public void shieldBash() {
        this.shielded = true;
    }

    @Override
    public void takeDamage(int amount) {
        if (this.shielded) {
            super.takeDamage(amount / 2); // Хамгаалалттай бол damage 50% багасна
            this.shielded = false;        // Нэг удаа хамгаалаад бамбай бууна
        } else {
            super.takeDamage(amount);     // Хэвийн үед эцэг классын функцийг дуудна
        }
    }
}