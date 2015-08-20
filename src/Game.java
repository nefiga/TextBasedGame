
public class Game {

    Player player;

    public Game() {
        player = new Player();
    }

    public void startGame() {
        System.out.println("Player's name " + player.name);
        System.out.println("Player's age " + player.age);

        player.name = "Ryan";

        System.out.println("Player's name is now " + player.name);

        player.age = 35;

        System.out.println("Player's age is now " + player.age);
    }

    public static void main(String[] args) {
        Game game = new Game();

        game.startGame();
    }
}
