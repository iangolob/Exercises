package z2;

public class Factory {
	public static Game createGame(String name, int rating) {
		Game game = new Game(name){};
		game.setRating(rating);
		return game;
	}
}
