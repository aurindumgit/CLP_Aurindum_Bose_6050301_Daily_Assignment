package cg.demo.springbootassignment2.exception;

public class MobileNumberDoesNotExistsForEmployeeException extends RuntimeException {

    public MobileNumberDoesNotExistsForEmployeeException(String message) {
        super(message);
    }
}