import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
public class Role {
    private final int id;
    private final String roleName;
    private String roleInfo;
    //TODO дописать роли, чтобы роли были статусами, которые можно апнуть или забанить

    public Role(String roleName, String description) {
        this.id = Generator.generateID();
        this.roleName = roleName;
        this.roleInfo = description;
    }

    public void setDescription(String description) {
        roleInfo = description;
    }
}
