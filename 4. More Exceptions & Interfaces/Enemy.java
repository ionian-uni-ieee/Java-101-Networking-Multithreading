import java.util.Random;

public class Enemy {

	private String name;
	private int hp;
	private int ac;
	private int dmgDie;
	private int atkBonus;
	private int dmgBonus;
	private boolean isAlive = true;

	private Random generator = new Random();


	//public methods that will be called
	public Enemy(int hp, int ac, int dmgDie, int atkBonus, int dmgBonus){
		this.hp = hp;
		this.ac = ac;
		this.dmgDie = dmgDie;
		this.atkBonus = atkBonus;
		this.dmgBonus = dmgBonus;

		this.pickRandomName();
	}


	public void attackPlayer(Player p){

		System.out.println(getType() + " " + this.name + " tries to hit you");

		int atkRoll = generator.nextInt(20) + 1 + atkBonus;			//pick random number from 1 to 20

		if(atkRoll >= p.getAc()){				//if our attack reaches the targets AC

			int damageAmount = getDamageAmount();
			System.out.println(this.name + " hits you for " + damageAmount + " damage...\n\n" );
			p.loseHp(damageAmount);
			return;   	//we can use return on void method as long as we don't return anything. It basically says "get out of this method ASAP"
		}

		System.out.println( this.name + " misses... " + this.name + " sad :(\n\n");
	}

	public boolean isAlive(){
		return this.isAlive;
	}

	public void loseHp(int damage){
		this.hp-=damage;
		if(this.hp<=0){
			isAlive = false;
			this.makeDeathSound();
		}
	}


	public int getAc(){
		return this.ac;
	}


	public String getType(){
		return "enemy";
	}

	//Helper methods here. Will only be called by other methods
	//protected means private for classes outside the package except if they're inherited
	//We don't want them to be accessed because they shouldn't be called except by our public methods but we want them to be inherited

	private int getDamageAmount(){

		int damage = generator.nextInt(dmgDie) + 1 + dmgBonus;

		return damage;
	}

	private void pickRandomName(){
		String[] names = new String[]{"Grook","Droop","Groot","Dugrul","Gogaz","Oorg","Azog","Ozborne Greenbottle","Droob","Ogog","Garnag"};
		int index = generator.nextInt(names.length);

		this.name = names[index];
	}

	private void makeDeathSound(){
		System.out.println( getType() + " " + this.name +  " dies. " + pickFunnyDeathLine()); 
	}

	private String pickFunnyDeathLine(){
		String[] funnyLines = new String[]{"Another one bites the dust" , "He had a family..." , "How could you?..." , "God, finally", ""};
		int index = generator.nextInt(funnyLines.length);

		return funnyLines[index];
	}

}