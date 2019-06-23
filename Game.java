import java.util.Scanner;

public class Game {

    public static void main(String args[]) {
        Character mario = new Character("(M)", 100, 20, 30);
        Character toad = new Character("=D", 90, 70, 60);
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Select 1 for Mario or 2 for Toad ....");
        System.out.println("Select an option: ");
        int op = sc.nextInt();

        switch (op) { // conditonal for selections
        case 1:
            mario.printing();
            System.out.println("Attack times:");
            int x = sc1.nextInt();
            for (int i = 0; i < x; i++) { // repeat of instructions (loop)
                mario.attack(toad);
            }
            break;
        case 2:
            toad.printing();
            break;
        }

    }
    // toad.attack(mario);
    // mario.attack(toad);
    // toad.attack(mario);

    // if (mario.getLifePoints() <= 0) {
    // mario.die();
    // }
    // }
}