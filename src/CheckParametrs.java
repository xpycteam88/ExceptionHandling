
public class CheckParametrs {

    public static void checkingParam(String login, String password, String confirmPassword) {
        if (login.length() > 20 || !checkSimbols(login)) {
            throw new WrongLoginException("Incorrect login, invalid characters are used or their length is exceeded");
        }
        if (password.length() > 20 || !checkSimbols(password)) {
            throw new WrongPasswordException("Incorrect password, invalid characters are used or their length is exceeded");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords don't match");
        }

    }

    public static boolean checkSimbols(String text) {
        return text.matches("^[a-zA-Z0-9_]+$");
    }
}
