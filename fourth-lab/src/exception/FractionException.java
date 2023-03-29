package exception;

public class FractionException extends Exception{
    public FractionException(){

    }
    public FractionException(String msg){
        super(msg);
    }
    public FractionException(String msg, Throwable cause){
        super(msg, cause);
    }
    public FractionException(Throwable cause){
        super(cause);
    }
}
