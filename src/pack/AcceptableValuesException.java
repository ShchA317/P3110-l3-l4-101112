package pack;

public class AcceptableValuesException extends Exception{
    public AcceptableValuesException(){
        super();
    }

    public AcceptableValuesException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
