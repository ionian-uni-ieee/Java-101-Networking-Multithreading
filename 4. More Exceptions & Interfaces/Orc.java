import java.util.Random;

public class Orc extends Enemy{

	public Orc(){
		super(15,13,12,5,3);
	}

	@Override 
	public String getType(){
		return "orc";
	}
}