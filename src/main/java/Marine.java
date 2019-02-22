public class Marine extends Humans {

    public void blast(Aliens alien) {

        if (alien.currentTime != 0 && System.currentTimeMillis() - alien.currentTime > TIMEOUT) {
            shootAlien(alien);
            alien.energy -= 10;
        }
        else {
            System.out.println("the marine is freezed");
        }
    }
}
