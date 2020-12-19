package pack;

public abstract class Creature implements shielded{
	private final String name;
	
	public Creature(String name) {
		this.name = name;
}
		
	public String getName() {
		return name;
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
}