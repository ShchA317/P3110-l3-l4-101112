package pack;

public final class Carlson extends Human {	
	private static Carlson instance;
    private Carlson(String name){super(name); }
    
    public static Carlson getCarlson(){
    if(instance == null){
        instance = new Carlson("Carlson");	
        }
    return instance;
    }

    @Override
    public void editPicture(TV tv) {
        System.out.println(this.toString() + " changes the picture settings in the " + tv.toString());
        toHappiness();
    }
}
