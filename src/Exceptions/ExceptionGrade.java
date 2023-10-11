package Exceptions;

public class ExceptionGrade extends Exception{
    public ExceptionGrade() {}

    public ExceptionGrade(String s) {
        super(s);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
