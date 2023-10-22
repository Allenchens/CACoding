package interface_adapter.clear_users;

// TODO Complete me

import java.util.Collections;
import java.util.List;

public class ClearViewModel {
    private List<String> deletedUsers;

    public List<String> getDeletedUsers() {
        if (deletedUsers == null) {
            return Collections.emptyList();
        }
        return deletedUsers;
    }
    public void setDeletedUsers(List<String> deletedUsers) {
        this.deletedUsers = deletedUsers;
    }
}