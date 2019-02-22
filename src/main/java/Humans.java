public class Humans implements Character {
    int health;
    int ammo;
    boolean isDead;

    public Humans() {
        health = 100;
        ammo = 200;
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

    public void shootAlien(Aliens alien) {
        if (alien.health <= 0) {
            alien.isDead();
            return;
        }

        alien.setHealth(alien.health - 15);
        ammo -= 15;

    }
}
