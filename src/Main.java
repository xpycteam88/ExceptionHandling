public class Main {
    public static void main(String[] args) {
        String login = "xpyct";
        String password = "1234";
        String confirmPassword = "1234";

        try {
            CheckParametrs.checkingParam(login, password, confirmPassword);
            System.out.println("Success");
        } catch (NullPointerException e) {
            throw new RuntimeException("Login or Password is null");
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}