package cg.demo.springbootassignment2.exception;

public class DepartmentNameNotFoundException extends RuntimeException {

    public DepartmentNameNotFoundException(String message) {
        super(message);
    }
}