package pack;

public class lab3_4 {

	public static void main(String[] args) {
		Carlson carlson = Carlson.getCarlson();
		TV tv = new TV("TV");
		Human baby = new Human("Baby");
		Human oldster = new Human("old forester");
		Human announcer = new Human("announcer", "pretty");
		Human sirs = new Human("gentlemen", "serious and complete");
		tv.setPicture(oldster);

		carlson.comeClose(tv);
		//carlson.kneeldown();
		//carlson.lookedAt(tv);

		//baby.explainClass();

		tv.setPicture(announcer);
		announcer.smile();
		carlson.smile(announcer);
		
		carlson.push(baby);
		tv.setPicture(sirs);
		carlson.pushButtons(tv);

		//carlson.switchOff(tv);
		//baby.becameAlarmed();
	}
}