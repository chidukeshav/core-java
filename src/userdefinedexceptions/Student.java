package userdefinedexceptions;

class FailException extends Exception {

    String msg;
    FailException(String msg) {
        this.msg = msg;
    }
    public String getMessage() {
        return msg;
    }
}

public class Student {
    static void result() throws FailException {
        int marks = 25;
        if (marks >= 35) {
            System.out.println("Student passed");
        } else {
            throw new FailException("Student failed");
        }
    }
    public static void main(String[] args) {
        try {
            result();
        } catch (FailException e) {
            System.out.println(e.getMessage());
        }
    }
}