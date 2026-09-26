package userdefinedexceptions;

class AgeException extends Exception {

    String msg;
    AgeException(String msg) {
        this.msg = msg;
    }
    public String getMessage() {
        return msg;
    }
}

public class Voting {
    static void vote() throws AgeException {
        int age = 16;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            throw new AgeException("You are not eligible to vote");
        }
    }
    public static void main(String[] args) {
        try {
            vote();
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}