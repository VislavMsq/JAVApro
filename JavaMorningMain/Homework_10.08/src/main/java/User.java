import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class User {
    private final int id;
    private final String username;
    private final String email;
    private String description;
    private List<Role> roles = new ArrayList<>();

    public User(String username) {
        this.id = Generator.generateID();
        this.username = username;
        this.email = Generator.generateMail();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addRole(Role role) {
        roles.add(role);
    }

    public void removeRole(Role role) {
        roles.remove(role);
    }
}
