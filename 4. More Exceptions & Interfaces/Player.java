import java.util.Random;

public class Player {

	private String name = "Nikos";	
	private int hp = 23;
	private int ac = 15;
	private int dmgDie = 6;
	private int atkBonus = 5;
	private int dmgBonus = 3;
	private boolean isAlive = true;

	private Random generator = new Random();


	public void loseHp(int damage){
		this.hp-=damage;
		if(this.hp<=0){
			isAlive = false;
			System.out.println("\nLooks like your adventure didn't last that long");
		}
	}

	public int getAc(){
		return this.ac;
	}

	public boolean isAlive(){
		return isAlive;
	}


	public void attackEnemy(Enemy e){
		System.out.println("You try to attack the enemy...");

		int atkRoll = generator.nextInt(20) + 1 + atkBonus;			//pick random number from 1 to 20

		if(atkRoll >= e.getAc()){				//if our attack reaches the targets AC

			int damageAmount = getDamageAmount();
			System.out.println("You hit the enemy for " + damageAmount + " damage...\n\n" );
			e.loseHp(damageAmount);
			return;   	//we can use return on void method as long as we don't return anything. It basically says "get out of this method ASAP"
		}

		System.out.println( "You missed. \n\n");
	}



	protected int getDamageAmount(){

		int damage = generator.nextInt(dmgDie) + 1 + dmgBonus;

		return damage;
	}
}