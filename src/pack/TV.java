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

	Shield shield = new Shield();

	public void pushOnOneOfButtons() {
		shield.editPicture();
	}

	public void setPicture(shielded picture){
		shield.setPicture(picture);
	}

	class Shield{
		private shielded picture;
		private String name = "screen";

		public void setPicture(shielded picture) {
			System.out.println(this.picture.toString() + " disappear on the " + this.toSting());
			this.picture = picture;
			System.out.println(this.picture.toString() + " appear on the " + this.toSting());
		}

		public void editPicture(){
			System.out.println("picture was be edited");
		}

		private String toSting() {
			return this.name;
		}
	}
}
