package interface_adapter.clear_users;

public class ClearState {

    private String username = "";
    private String usernameError = null;
    private String password = "";
    private String passwordError = null;

    // Add a field to store the deleted users' names
    private String deletedUsers = "";


    public ClearState(ClearState copy) {
        username = copy.username;
        usernameError = copy.usernameError;
        password = copy.password;
        passwordError = copy.passwordError;
        deletedUsers = copy.deletedUsers; // Initialize the deletedUsers field
    }

    public ClearState(){}

    public String getUsername() {
        return username;
    }

    public String getUsernameError() {
        return usernameError;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordError() {
        return passwordError;
    }

    // Getter and setter for the deletedUsers field
    public String getDeletedUsers() {
        return deletedUsers;
    }

    public void setDeletedUsers(String deletedUsers) {
        this.deletedUsers = deletedUsers;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUsernameError(String usernameError) {
        this.usernameError = usernameError;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }
}