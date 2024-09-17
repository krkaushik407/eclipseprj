package oops.polymorphism.runtime.examples.a2;

public class MainClass {
	// Create a Sport class
	// in that create a abstract method game()
	// run the game() method with
	// 2 different games (implementations)
	// without creating child class

	public static void main(String[] args) {
		Sport sport;

		sport = new Sport() {
			@Override
			public void game() {
				System.out.println("Game is Football");
			}
		};
		sport.game();

		sport = new Sport() {
			@Override
			public void game() {
				System.out.println("Game is Badminton");
			}
		};
		sport.game();
	}

}
