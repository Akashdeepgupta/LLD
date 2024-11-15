package Design_patterns.structural_design_patterns.Adapter_design_pattern;

public class User {
    String userName;
    String password;

    public User(String userName, String  password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

