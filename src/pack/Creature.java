package pack;

public abstract class Creature implements shielded{
	private final String name;
	private final String characteristic;
	
	public Creature(String name) {this.name = name; characteristic = "ordinary";}
	public Creature(String name, String characteristic){this.name = name; this.characteristic = characteristic;}
		
	public String getName() {
		return name;
	}
	public String getCharacteristic(){
		return characteristic;
	}

	public void push(Creature c) {
		System.out.println(this.toString() + " push " + c.toString());
	}

	public void go(){System.out.println(this.toString() + " is coming");}

	public void comeClose(Object obj){
		System.out.println(this.toString() + "come close to " + obj.toString());
	}

	@Override
	public String toString(){
		return this.getName();
	}

	public String toFullString(){
		if (!this.characteristic.equals("ordinary")) return this.getCharacteristic() + " " + this.getName();
		return this.getName();
	}

}