package userdefinedexceptions;

class InvalidPinException extends Exception {

    String msg;
    InvalidPinException(String msg) {
        this.msg = msg;
    }
    public String getMessage() {
        return msg;
    }
}

public class ATM {
    static void checkPin() throws InvalidPinException {
        int pin = 1234;
        if (pin == 5678) {
            System.out.println("Correct PIN");
        } else {
            throw new InvalidPinException("Invalid PIN");
        }
    }
    public static void main(String[] args) {
        try {
            checkPin();
        } catch (InvalidPinException e) {
            System.out.println(e.getMessage());
        }
    }
}