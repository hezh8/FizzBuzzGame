package com.xxx.demo;

public class Main {

	public static void main(String[] args) {
		try {
			// Stage1
			Game game = new Game();
			/*game.beReady(33);
			game.run();*/

			// Stage2
			game = new Game();
			game.beReady(100);
			game.runHard();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
