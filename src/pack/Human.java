package pack;

public class Human extends Creature implements ableToInteractWithTV{

	public Human(String name) {
		super(name);
		condition = Condition.NORMAL;
	}
	public Human(String name, String characteristic){
		super(name, characteristic);
		condition = Condition.NORMAL;
	}

	private Condition condition;

	public void smile() {
		System.out.println(this.toString() + " smiles");
	}
	public void smile(Human h) {
		System.out.println(this.toString() + " smiles at " + h.toString());
	}
	public void talk() {
		System.out.println(this.toString() + " talking");
	}
	public void toAnnoy(){
		condition = Condition.IRRITATED;
		System.out.println(this.toString() + " become irritated");
	}
	public void toHappiness(){
		condition = Condition.PLEASED;
		System.out.println(this.toString() + " become pleased");
	}

	@Override
	public void pushButtons(TV tv) {
		System.out.println(this.toString() + " push all buttons of " + tv.toString());
		tv.pushOnOneOfButtons();
	}

	@Override
	public void talkAndTalk(){
		System.out.println(this.toString() + " talk and talk");
	}

	@Override
	public void editPicture(TV tv) {
		System.out.println(this.toString() + " changes the picture settings in the " + tv.toString());
	}


}

enum Condition{
	NORMAL, IRRITATED, PLEASED
} 