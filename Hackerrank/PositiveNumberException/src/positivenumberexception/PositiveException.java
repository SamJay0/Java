package positivenumberexception;

/**
 * @author SamJay
 */
public class PositiveException extends Exception {

    String message;

    //constructor
    public PositiveException(String s) {
        this.message = s;

    }

    //getter
    public String getMessage() {
        return message;
    }

}
