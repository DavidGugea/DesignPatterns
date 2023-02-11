package BehavioralDesignPatterns.ChainOfResponsability.middleware;

public class RoleCheckMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin2@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }

        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
