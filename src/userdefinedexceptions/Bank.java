package userdefinedexceptions;

class InsufficientBalanceException extends Exception {

    String msg;
    InsufficientBalanceException(String msg) {
        this.msg = msg;
    }
    public String getMessage() {
        return msg;
    }
}

public class Bank {
    static void withdraw() throws InsufficientBalanceException {
        int balance = 10;
        if ( balance >= 100 ) {
            System.out.println("Withdrawal successful");
        } else {
            throw new InsufficientBalanceException("Insufficient balance");
        }
    }
    public static void main(String[] args) {
        try {
            withdraw();
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}