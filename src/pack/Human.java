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
	private double learningAbility = 0.5;

	public double getLearningAbility(){
		return learningAbility;
	}

	public void setLearningAbility(double d) throws AcceptableValuesException{
		if(d < 0 || d > 1) throw new AcceptableValuesException("learningAbility must be > 0, but < 1");
		else this.learningAbility = d;
	}

	public void becameAlarmed(String because){
		System.out.println(this.toString() + " became alarmed because " + because);
	}

	public void smile() {
		System.out.println(this.toString() + " smiles");
	}
	public void smile(Human h) {
		System.out.println(this.toString() + " smiles at " + h.toString());
	}
	public void laugh(){
		System.out.println(this.toString() + " laugh ");
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

	public void kneelDown(){
		System.out.println(this.toString() + " knelt down");
	}

	@Override
	public void pushButtons(TV tv) {
		System.out.println(this.toString() + " push all buttons of " + tv.toString());
		tv.pushOnOneOfButtons();
	}

	@Override
	public void switchOff(TV tv) {
		System.out.println(this.toString() + " switch off the " + tv.toString());
	}

	@Override
	public void talkAndTalk(){
		System.out.println(this.toString() + " talk and talk");
	}

	@Override
	public void editPicture(TV tv) {
		System.out.println(this.toString() + " changes the picture settings in the " + tv.toString());
	}

	public void think(){System.out.println(this.toString() + " think");}
	public void say(){System.out.println(this.toString() + " say");}

	private String wish;
	private String Duty;

	public void setDuty(String s){
		this.Duty = s;
	}

	public String getDuty(){
		return this.Duty;
	}

	public void setWish(String wish) {
		this.wish = wish;
	}

	public void setWish(String wish, Object target){
		this.wish = wish + " " + target;
	}

	public String getWish() {
		return wish;
	}

	public void explainTry(String thing, double lvlOfDesire, Human tWhom) throws AcceptableValuesException{
		if (lvlOfDesire > 1 || lvlOfDesire < 0)
			throw new AcceptableValuesException("lvlOfDesire must be > 0, but < 1");
		System.out.println(this.toString() + " try to explain to " + tWhom.toString() + thing);
		if(lvlOfDesire > 0.9){
			System.out.println(this.toString() + " really want to explain to " + tWhom.toString() + " " + "what is it");
		}
		if(tWhom.getLearningAbility() < 0.4){
			tWhom.laugh();
		}
	}
}

enum Condition{
	NORMAL, IRRITATED, PLEASED
} 