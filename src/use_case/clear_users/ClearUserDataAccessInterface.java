package use_case.clear_users;

import java.util.List;

public interface ClearUserDataAccessInterface {
    void clearAllUsers();

    List<String> getDeletedUserNames();
}