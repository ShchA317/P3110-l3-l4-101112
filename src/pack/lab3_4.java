package pack;

public class lab3_4 {

	public static void main(String[] args) {
		Carlson carlson = Carlson.getInstance();
		TV tv = new TV("TV");
		Human baby = new Human("Baby");
		Human oldster = new Human("oldster");
		Human announcer = new Human("announcer");
		Human sirs = new Human("gentlemen");


		carlson.comeClose(tv);
		carlson.kneeldown();
		carlson.lookedAt(tv);

		baby.explainClass();



		announcer.smile();
		carlson.smile(announcer);
		
		carlson.push(baby);
		tv.setPicture(sirs);
		carlson.pushButtons(tv);

		carlson.switchOff(tv);
		baby.becameAlarmed();
	}
}