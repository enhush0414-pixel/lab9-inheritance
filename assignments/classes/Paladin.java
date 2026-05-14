

public class Paladin extends Warrior {

    public Paladin(String name) {
        super(name); // Энэ нь Warrior-ийн constructor-ийг дуудна
        this.hp = 180;
        this.maxHp = 180;
    }

    public void heal(int amount) {
        if (amount > 0) {
            this.hp = Math.min(this.maxHp, this.hp + amount);
        }
    }
}