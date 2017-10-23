package system.model;

/**
 * Created by User on 05.06.2017.
 */
public class User {
    private String emale;
    private String password;

    public String getName() {
        return emale;
    }

    public void setName(String name) {
        this.emale = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String emale, String password) {
        this.emale = emale;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "emale='" + emale + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
