public class IncorrectDivideExcep extends RuntimeException{
    public IncorrectDivideExcep(String message){
        super(message);
    }
}

class ExceptionMessage{
    public static final String DIVIDE_EXCEPTION = "Param 'b' is '0'";
}