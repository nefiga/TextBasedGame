import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    Player player;

    public Game() {
        player = new Player();
    }

    public void startGame() {
        System.out.println("What do you want to name your player?");

        player.name = scanner.nextLine();

        System.out.println("Your players name is " + player.name);
        System.out.println("What age do you want your character to be?");

        player.age = scanner.nextInt();

        System.out.println("Your characters age is " + player.age);
    }

    public static void main(String[] args) {
        Game game = new Game();

        game.startGame();
    }
}
