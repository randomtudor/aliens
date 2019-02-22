import java.util.*;

public class Main {
    public static void main(String[] args) {
        Aliens alien = new Aliens();
        Humans human = new Humans();
        Marine marine = new Marine();

        System.out.println("Enter option: ");
        System.out.println("1 human to shoot the alien");
        System.out.println("2 alien to bite the human");
        System.out.println("3 alien to freeze the marine");
        System.out.println("4 alien to bite the marine");
        System.out.println("5 marine to blast the alien");
        System.out.println("0 for exiting");

        Scanner in = new Scanner(System.in);
        while(true) {
            switch (in.nextInt()) {
                case 1:
                    human.shootAlien(alien);
                    System.out.println("alien health is: " + alien.getHealth());
                    break;
                case 2:
                    alien.biteHuman(human);
                    System.out.println("human health is " + human.getHealth());
                    break;
                case 3:
                    alien.freeze();
                    System.out.println("the marine is freezed 20 seconds");
                    break;
                case 4:
                    alien.biteMarine(marine);
                    System.out.println("marine health is " + marine.getHealth());
                    break;
                case 5:
                    marine.blast(alien);
                    System.out.println("alien health is: " + alien.getHealth());
                    break;
                case 0:
                    System.out.println("Bye.");
                    return;
                default:
                    System.out.println("ERROR. Invalid option.");
                    break;
            }

            if (human.isDead()) {
                System.out.println("Human is dead. GAME OVER");
                return;
            }

            if (alien.isDead()) {
                System.out.println("Alien is dead. GAME OVER.");
                return;
            }

            if (marine.isDead()) {
                System.out.println("Marine is dead. GAME OVER.");
                return;
            }
        }
    }
}
