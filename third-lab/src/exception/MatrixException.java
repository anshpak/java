package exception;

public class MatrixException extends Exception{
    public MatrixException(){

    }
    public MatrixException(String msg){
        super(msg);
    }
    public MatrixException(String msg, Throwable cause){
        super(msg, cause);
    }
    public MatrixException(Throwable cause){
        super(cause);
    }
}
