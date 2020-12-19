package pack;

public class lab3_4 {

	public static void main(String[] args) {
		Carlson carlson = Carlson.getInstance();
		TV tv = new TV("TV");
		Human baby = new Human("Baby");
		
		
		announcer.smile();
		carlson.smile(announcer);
		
		carlson.push(baby);
		announcer.disappeared(tv);
		
		sirs.appeared(tv);
		sirs.talk();
		
		carlson.pushButtons(tv);
	}
}