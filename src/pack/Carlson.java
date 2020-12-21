package pack;

public final class Carlson extends Human {	
	private static Carlson instance;
    private Carlson(String name) throws AcceptableValuesException {super(name); super.setLearningAbility(0.2); }
    
    public static Carlson getCarlson() throws AcceptableValuesException {
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
