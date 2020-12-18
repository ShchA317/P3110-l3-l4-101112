package pack;

public class TV {
	String name;
	
	public TV(String name) {
		this.name = name;
		Shield shield = new Shield();
	}
	@Override
	public String toString(){
		return this.name;
	}

	private class Shield{
		private shielded picture;
		private String name = "shield";
		public void setPicture(shielded picture) {
			System.out.println(this.picture.toString() + " disappear on " + this.toSting());
			this.picture = picture;
			System.out.println(this.picture.toString() + " appear on " + this.toSting());
		}

		private String toSting() {
			return this.name;
		}
	}
}
