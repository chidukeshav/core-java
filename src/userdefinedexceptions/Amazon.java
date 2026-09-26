package userdefinedexceptions;

class AmazonException extends Exception {

    String msg;
    AmazonException(String msg) {
        this.msg = msg;
    }
    public String getMessage() {
        return msg;
    }
}

public class Amazon {
    static void order() throws AmazonException {
        int product = 4999;
        if (product >= 5000) {
            System.out.println("Discount available");
        } else {
            throw new AmazonException("no discount");
        }
    }
    public static void main(String[] args) {
        try {
            order();
        } catch (AmazonException e) {
            System.out.println(e.getMessage());
        }
    }
}