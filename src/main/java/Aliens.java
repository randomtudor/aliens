public class Aliens implements Character {
    int health;
    int energy;
    boolean isDead;
    long currentTime;

    public Aliens() {
        health = 200;
        energy = 100;
        isDead = false;
    }

    public int getHealth() {
        if (health < 0)
            return 0;
        else
            return health;
    }

    public void setHealth(int h) {
        health = h;
    }

    public boolean isDead() {
        if (health <= 0)
            isDead = true;

        return isDead;
    }

    void biteHuman(Humans human) {
        if (human.health <= 0) {
            human.isDead();
            return;
        }

        if (energy > 80)
            human.setHealth(human.health - 20);
        else if (energy < 50)
            human.setHealth(human.health - 5);
        else
            human.setHealth(human.health - 10);

        energy -= 10;
    }

    void biteMarine(Marine marine) {
        if (marine.health <= 0) {
            marine.isDead();
            return;
        }

        marine.setHealth(marine.health - 5);
    }

    void freeze() {
        currentTime = System.currentTimeMillis();
        energy -= 5;
    }
}
