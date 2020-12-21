package pack;

public class lab3_4 {

	public static void main(String[] args) throws AcceptableValuesException {
		Carlson carlson = Carlson.getCarlson();
		TV tv = new TV("TV");
		Human baby = new Human("Baby");
		Human oldster = new Human("old forester");
		Human announcer = new Human("announcer", "pretty");
		Human sirs = new Human("gentlemen", "serious and complete");
		tv.setPicture(oldster);
		baby.setDuty("must prevent the meeting of Karlson and Miss Bock");

		carlson.comeClose(tv);
		carlson.kneelDown();
		carlson.lookedAt(tv);

		try {
			String smthToExplain = "that It is not human, it is a picture";
			baby.explainTry(smthToExplain, 0.99, carlson);
		}
		catch (AcceptableValuesException e){
			System.out.println(e.getMessage());
		}
		baby.setWish("safe ", carlson);
		System.out.println(baby.getWish());
		carlson.laugh();
		baby.laugh();

		String smthToExplain = "all again";
		baby.explainTry(smthToExplain, 0.9, carlson);

		tv.setPicture(announcer);
		announcer.smile();
		carlson.smile(announcer);
		
		carlson.push(baby);
		tv.setPicture(sirs);
		carlson.toAnnoy();
		carlson.pushButtons(tv);
		carlson.toHappiness();

		sirs.talkAndTalk();
		carlson.switchOff(tv);
		baby.becameAlarmed("if carlson struggles then miss bock will notice him");
		System.out.println("Baby " + baby.getDuty());
		baby.setWish("scare Carlson so he doesn't get caught");
		System.out.println(baby.toString() + " must " + baby.getWish());
		baby.think();
		baby.say();
	}
}