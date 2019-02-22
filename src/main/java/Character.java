import java.util.concurrent.TimeUnit;

public interface Character {
    long TIMEOUT = TimeUnit.SECONDS.toMillis(20);

    int getHealth();
    void setHealth(int health);
    boolean isDead();
}
