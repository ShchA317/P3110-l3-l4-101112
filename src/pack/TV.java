package pack;

public class TV<protacted> {
	String name;
	
	public TV(String name) {
		this.name = name;
		Shield shield = new Shield();
	}

	@Override
	public String toString(){
		return this.name;
	}

	Shield shield = new Shield();

	public void toPushOnOneOfButtons() {
		shield.editPicture();
	}

	protected class Shield{
		private shielded picture;
		private String name = "shield";

		public void setPicture(shielded picture) {
			System.out.println(this.picture.toString() + " disappear on " + this.toSting());
			this.picture = picture;
			System.out.println(this.picture.toString() + " appear on " + this.toSting());
		}

		public void editPicture(){
			System.out.println();
		}

		private String toSting() {
			return this.name;
		}
	}
}
