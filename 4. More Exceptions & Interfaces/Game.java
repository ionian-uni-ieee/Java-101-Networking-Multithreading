public class Game {


	public static void main(String[] args){
		Game game = new Game();
		game.start();
	}

	public void start(){

		Player p = new Player();
		Orc c = new Orc();

		System.out.println(p.isAlive() + " " + c.isAlive());

		while(p.isAlive() && c.isAlive()){

			p.attackEnemy(c);

			if(c.isAlive()){
				c.attackPlayer(p);
			}
		}
		System.out.println("end of combat");
	}
}