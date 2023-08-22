import java.util.Map;
import java.util.Optional;

public class AuthenticationService {
    private UserDatabase userDatabase = new UserDatabase();


    public boolean authenticate(String username, String password) {
        Optional<Map.Entry<User, String>> user = userDatabase.getUsers().entrySet().stream()
                .filter(el -> el.getKey().getUsername().equals(username))
                .findFirst();

        if (user.isEmpty()) {
            throw new AuthenticationServiceException("User not founded or not registered");
        }
        return user.get().getValue().equals(password);
    }
    //TODO тут повышаем роль в зависимоти от предыдушей роли
    public void grantAccess(User user) {
        if (authenticate(user.getUsername(), "pass")) {
            System.out.println("Access");
        }
        throw new AuthenticationServiceException("User not founded or not registered");
    }

    public void register(User user, String password) {
        try {
            authenticate(user.getUsername(), password);
            throw new RegisterServiceException("Already registered");
        } catch (AuthenticationServiceException e) {
            userDatabase.put(user, password);
        }
    }

    public void revokeAccess(User user) {

    }
}
