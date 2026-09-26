package userdefinedexceptions;

class LoginException extends Exception {

    String msg;
    LoginException(String msg) {
        this.msg = msg;
    }
    public String getMessage() {
        return msg;
    }
}

public class Login {
    static void checkLogin() throws LoginException {
        String username = "admin";
        if (username.equals("admin")) {
            System.out.println("Login successful");
        } else {
            throw new LoginException("Invalid username");
        }
    }
    public static void main(String[] args) {
        try {
            checkLogin();
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        }
    }
}