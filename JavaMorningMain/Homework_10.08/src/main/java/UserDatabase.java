import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class UserDatabase {
    private Map<User, String> users = new HashMap<>();

    public void put(User user, String pass) {
        users.put(user, pass);
    }
}
